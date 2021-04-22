package com.maxnum;

public class MaxNum {
    public Integer findMaximum (Integer firstNum, Integer secondNum, Integer thirdNum) {
        // Comparing one number with other using IF condition
        if (firstNum.compareTo(secondNum) > 0 && firstNum.compareTo(thirdNum) > 0)
            return firstNum;

        if (secondNum.compareTo(thirdNum) > 0)
            return secondNum;
        return thirdNum;
    }
}
