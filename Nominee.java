package com.company.nominee;

 import com.company.award.Award;

 import java.util.Random;

public class Nominee {

    private String name;
    public int d;

    private int nomineeAwardQuantityLimit;
    private int nomineeAwardQuantitySum = 0;
    private float nomineeAwardAmountLimit;
    private float nomineeAwardAmountSum = 0;

    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public float getNomineeAwardAmountLimit() {
        return nomineeAwardAmountLimit;
    }

    public int getNomineeAwardQuantitySum() {
        return nomineeAwardQuantitySum;
    }

    public float getNomineeAwardAmountSum() {
        return nomineeAwardAmountSum;
    }

    public void setNomineeAwardQuantityLimit(int nomineeAwardQuantityLimit) {
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public void setNomineeAwardAmountLimit(float nomineeAwardAmountLimit) {
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

    public Nominee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void receiveAward(Award award) {

            Double amountToAdd;

            if (award.getSoli() != null) {

                System.out.println("The original award amount before soli is " + " EUR" + award.getValue());
                System.out.println("The soli value is " + award.getSoli());
                // System.out.println("Nominator is" +  )
                Double awardWithSoli = award.getValue() * award.getSoli(); //I missed this before!!
                System.out.println("The final award amount with soli is " + awardWithSoli);

                if (award.getValue() > awardWithSoli) {
                    System.out.println("The final award has been decreased " + "by " + ((award.getValue() - awardWithSoli) / award.getValue()) * 100 + "%.");

                    System.out.println("==============================");
                } else if (award.getValue() < awardWithSoli) {

                    System.out.println("The final award has been increased " + "by " + ((awardWithSoli - award.getValue()) / award.getValue()) * 100 + "%.");
                   // System.out.println("==============================");
                }

                amountToAdd = awardWithSoli;

            } else {
                amountToAdd = new Double(award.getValue());

                Random rm = new Random();
                int c = rm.nextInt(1);
                int Z = rm.nextInt(6) + 1; //??
                int P = award.getValue();
                int population = 3;
                int quantity = ((Z ^ 2 * (P) * (1 - P)) / (c ^ 2)) / (1 + ((((Z ^ 2 * (P) * (1 - P)) / (c ^ 2)) - 1) / population));

                System.out.println("The final award amount is " + award.getValue() + " and Soli is not applied");
                System.out.println("The quantity is " + quantity);
            }
            this.nomineeAwardAmountSum += amountToAdd;
            this.nomineeAwardQuantitySum++;
            System.out.println("Total Award amount is " + this.nomineeAwardAmountSum);
            System.out.println("==============================");

    }
}


