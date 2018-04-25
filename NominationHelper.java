package com.company.award;


public class NominationHelper {

    public static boolean belowAwardQuantityLimit(int nomineeAwardQuantitySum, int nomineeAwardQuantityLimit ){
        return nomineeAwardQuantitySum < nomineeAwardQuantityLimit;
    }

    public static boolean belowAwardAmountLimit(float nomineeAwardAmountSum, float nomineeAwardAmountLimit) {
        return  nomineeAwardAmountSum < nomineeAwardAmountLimit;
    }

    public static boolean belowAwardQuantityLimit1(int nominatorAwardQuantitySum, int nominatorAwardQuantityLimit) {
        return nominatorAwardQuantitySum < nominatorAwardQuantityLimit;
    }

    public static boolean belowAwardAmountLimit1(float nominatorAwardAmountSum, float nominatorAwardAmountLimit) {
        return nominatorAwardAmountSum < nominatorAwardAmountLimit;
    }
}