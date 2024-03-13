package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LogicProblemDemoTest {

    private LogicProblemDemo demo = new LogicProblemDemo();

    @Test
    public void testConditionOne() {
        assertEquals("value + 5", demo.getCalculatedValue(11, 11, 9, true));
        assertEquals("value + 5", demo.getCalculatedValue(11, 8, 25,  true));
        assertEquals("value + 5", demo.getCalculatedValue(11, 9, 11, true));
        assertNotEquals("value + 5", demo.getCalculatedValue(11, 9, 10, true));
        assertNotEquals("value + 5", demo.getCalculatedValue(11, 9, 11, false));
        assertNotEquals("value + 5", demo.getCalculatedValue(10, 11, 9, true));
    }

    @Test
    public void testConditionTwo() {
        assertEquals("value + 10", demo.getCalculatedValue(11, 11, 9, false));
        assertEquals("value + 10", demo.getCalculatedValue(11, 2, 99, false));
        assertNotEquals("value + 10", demo.getCalculatedValue(9, 11, 9, false));
        assertNotEquals("value + 10", demo.getCalculatedValue(11, 7, 9, false));
    }

    @Test
    public void testConditionThree() {
        assertEquals("value", demo.getCalculatedValue(8, 9, 26, true));
        assertEquals("value", demo.getCalculatedValue(9, 11, 9, true));
        assertNotEquals("value", demo.getCalculatedValue(10, 11, 9, false));
        assertNotEquals("value", demo.getCalculatedValue(-2, 11, 9, true));
    }

    @Test
    public void testConditonFour() {
        assertEquals("negative", demo.getCalculatedValue(-1, 9, 26, true));
        assertEquals("negative", demo.getCalculatedValue(-5, 11, 9, false));
        assertEquals("negative", demo.getCalculatedValue(-2, 11, 9, true));
        assertEquals("negative", demo.getCalculatedValue(-2, 11, 9, false));
        assertNotEquals("negative", demo.getCalculatedValue(0, 11, 9, true));
        assertNotEquals("negative", demo.getCalculatedValue(1, 11, 9, false));
    }

    @Test
    public void testConditionFive() {
        assertEquals("no value", demo.getCalculatedValue(12, 7, 9, true));
        assertEquals("no value", demo.getCalculatedValue(99, 7, 9, false));
        assertEquals("no value", demo.getCalculatedValue(129, 7, 9, false));
    }
}
