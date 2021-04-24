package com.maxnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxNum <E extends Comparable> {
    E firstNum;
    E secondNum;
    E thirdNum;
    E fourthNum;
    E fifthNum;
    public MaxNum( E firstNum, E secondNum, E thirdNum, E fourthNum, E fifthNum){
        this.firstNum=firstNum;
        this.secondNum=secondNum;
        this.thirdNum=thirdNum;
        this.fourthNum=fourthNum;
        this.fifthNum=fifthNum;
    }
    public E genericMax(){
        return findMaximumGeneric(firstNum, secondNum, thirdNum, fourthNum, fifthNum);
    }
    public static <E extends Comparable> E findMaximumGeneric( E firstNum, E secondNum, E thirdNum, E fourthNum, E fifthNum){
        List<E> testList = new ArrayList<>();
            testList.add(firstNum);
            testList.add(secondNum);
            testList.add(thirdNum);
            testList.add(fourthNum);
            testList.add(fifthNum);

        Collections.sort(testList);
        return testList.get(5);
    }
    public void printMaximum(){

        System.out.println("THE MAXIMUM OF :"+firstNum+" , "+secondNum+" , "+thirdNum+" , "+fourthNum+" , "+fifthNum+"  IS :");
        System.out.println(findMaximumGeneric(firstNum,secondNum,thirdNum,fourthNum,fifthNum));

    }

    public static void main(String[] args) {
        new MaxNum(15.2,15.3,15.4,15.1,15.11).printMaximum();
        new MaxNum("Apple","Peach","Banana","Pea","Pear").printMaximum();
    }
}
