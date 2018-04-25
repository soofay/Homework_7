package com.company.nominator;

import com.company.award.Award;
import com.company.nominee.Nominee;

public class Nominator {

        static {
        System.out.println("Nominator is initialized");
    }

    private String name;
    private int nominatorAwardQuantityLimit;
    private int nominatorAwardQuantitySum = 0;
    private float nominatorAwardAmountLimit;
    private float nominatorAwardAmountSum = 0;

    public Nominator(String name) {
        this.name = name;
    }

    public int getNominatorAwardQuantityLimit() {
        return nominatorAwardQuantityLimit;
    }

    public void setNominatorAwardQuantityLimit(int nominatorAwardQuantityLimit) {
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public float getNominatorAwardAmountLimit (){
       return nominatorAwardAmountLimit;
    }

    public void setNominatorAwardAmountLimit(float nominatorAwardAmountLimit) {
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public void nominate(Nominee nominee, Award award ) {
        nominee.receiveAward(award);
        this.nominatorAwardQuantitySum++;
        this.nominatorAwardAmountSum += award.getValue();
    }

    public int getNominatorAwardQuantitySum() {
        return nominatorAwardQuantitySum;
    }

    public void setNominatorAwardQuantitySum(int nominatorAwardQuantitySum) {
        this.nominatorAwardQuantitySum = nominatorAwardQuantitySum;
    }

    public float getNominatorAwardAmountSum() {
        return nominatorAwardAmountSum;
    }

    public void setNominatorAwardAmountSum(float nominatorAwardAmountSum) {
        this.nominatorAwardAmountSum = nominatorAwardAmountSum;
    }
}
