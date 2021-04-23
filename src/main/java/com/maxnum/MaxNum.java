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
}

