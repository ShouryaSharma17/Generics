package com.maxnum;

public class MaxNum {
    public Integer findMax (Integer firstNum, Integer secondNum, Integer thirdNum) {
        // Comparing one number with other using IF condition
        if (firstNum.compareTo(secondNum) > 0 && firstNum.compareTo(thirdNum) > 0)
            return firstNum;

        if (secondNum.compareTo(thirdNum) > 0)
            return secondNum;
        return thirdNum;
    }
    public Double findMaximum(Double firstNum, Double secondNum, Double thirdNum) {
        // Comparing Float Values
        if (firstNum.compareTo(secondNum) > 0 && firstNum.compareTo(thirdNum) > 0)
            return firstNum;

        if (secondNum.compareTo(thirdNum) > 0)
            return secondNum;

        return thirdNum;
    }
    public String findString( String firstString, String secondString, String thirdString) {
        // Comparing String Values
        if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) > 0)
            return firstString;
        if (secondString.compareTo(thirdString) > 0)
            return secondString;

        return thirdString;
    }
}

