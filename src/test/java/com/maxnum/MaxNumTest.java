package com.maxnum;
import org.junit.Test;
import org.junit.Assert;

public class MaxNumTest {
    MaxNum testObject = new MaxNum();
    @Test
    // UC1, TC 1.1 Test for checking greatest number at first position
    public void MaxNumberWhenAtFirstPosition() {
        int testMax = testObject.findMax(28, 13, 21);
        Assert.assertEquals(28, testMax);
    }
    @Test
    // TC 1.2 Test for checking greatest number at second position
        public void MaxNumberWhenAtSecondPosition() {
        int testMax = testObject.findMax(15, 39, 21);
        Assert.assertEquals(39, testMax);
    }
    @Test
     // TC 1.3 Test for checking greatest number at third position
        public void MaxNumberWhenAtThirdPosition() {
        int testMax = testObject.findMax(15,39,48);
            Assert.assertEquals(48,testMax);
        }
     @Test
     // UC2 Checking Float values
        public void FindMaxFloat() {
         double testMaximum = testObject.findMaximum(15.2, 15.3, 15.4);
         Assert.assertEquals(15.4, testMaximum, 0);
     }
     @Test
     //UC3 Checking String Value
        public void FindMaxString() {
        String testMaximum = testObject.findString("Apple", "Peach", "Banana");
        Assert.assertEquals("Banana", testMaximum);
    }
}
