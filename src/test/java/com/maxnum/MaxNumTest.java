package com.maxnum;
import org.junit.Test;
import org.junit.Assert;

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
    @Test
    // Method for checking the maximum float value
    public void FindMaxFloat() {
        double testMaximum = testObject.findMaximum(15.2,15.3,15.4);
        Assert.assertEquals( 15.4,testMaximum,0);
    }
    @Test
    // Method for checking the maximum string value
    public void FindMaxString() {
        String testMaximum = testObject.findString("Apple","Peach", "Banana");
        Assert.assertEquals( "Banana",testMaximum);
    }
}
