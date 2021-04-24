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

}
