package com.maxnum;

public class MaxNum <E extends Comparable> {
    E firstNum;
    E secondNum;
    E thirdNum;
    public MaxNum( E firstNum, E secondNum, E thirdNum){
        this.firstNum=firstNum;
        this.secondNum=secondNum;
        this.thirdNum=thirdNum;
    }
    public E genericMax(){
        return findMaximumGeneric(firstNum, secondNum, thirdNum);
    }
    public static <E extends Comparable> E findMaximumGeneric( E firstNum, E secondNum, E thirdNum){
        E position= firstNum;
        if( secondNum.compareTo(position) > 0)
            position= thirdNum;
        if( thirdNum.compareTo(position) > 0)
            position= secondNum;
        return position;
    }
}
