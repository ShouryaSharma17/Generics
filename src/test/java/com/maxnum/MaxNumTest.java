package com.maxnum;
import org.junit.Test;
import org.junit.Assert;

public class MaxNumTest {
    MaxNum testObject;
    @Test
    // UC1, TC 1.1 Test for checking greatest number at first position
    public void MaxNumberWhenGenericPassed() {
        testObject= new MaxNum(28,13,21);
        Integer testMax = (Integer) testObject.genericMax();
        Assert.assertEquals(28,(int) testMax);
    }
     @Test
     // UC2 Checking Float values
        public void FindMaxGenericFloat() {
         testObject= new MaxNum(15.2,15.3,15.4);
         Double testMaximum = (Double) testObject.genericMax();
         Assert.assertEquals(15.4, testMaximum, 0);
     }
     @Test
     //UC3 Checking String Value
        public void FindMaxGenericString() {
        testObject= new MaxNum("Apple","Peach","Banana");
        String testMaximum = (String) testObject.genericMax();
        Assert.assertEquals("Banana", testMaximum);
    }
}
