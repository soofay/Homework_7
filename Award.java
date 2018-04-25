package com.company.award;

public class Award {

    private final int value;
    private Double soli;

  static {
    System.out.println("Award is initialized");
   }

    public Award(int value, Double soli) {
        this.value = value;
        this.soli = soli;

   }
    public Double getSoli() {
        return this.soli;
    }

    public void setSoli(Double soli) {
        this.soli = soli;
    }

    public Award(int value) {
       this.value = value;
    }

     public int getValue() {
        return this.value;
    }
}