package com.maxnum;

import org.junit.Test;
import org.junit.Assert;

public class MaxNumTest {
    MaxNum testObject = new MaxNum();
    @Test
    // Method for checking the maximum float value
    public void FindMaxFloat() {
        double testMaximum = testObject.findMaximum(15.2,15.3,15.4);
        Assert.assertEquals( 15.4,testMaximum,0);
    }
}
