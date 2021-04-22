package com.maxnum;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumTest {
    MaxNum testObject = new MaxNum();
    @Test
    // Method for checking the greatest number
    public void MaxNumTest() {
        // Maximum Number At First Position
        int testMax = testObject.findMaximum(28,13,21);
        Assert.assertEquals(28,testMax);
        // Maximum Number At Second Position
        int testMaximum = testObject.findMaximum(15,39,21);
        Assert.assertEquals(39,testMaximum);
        // Maximum Number At Third Position
        int testMaxThird = testObject.findMaximum(15,39,48);
        Assert.assertEquals(48,testMaxThird);
    }
}
