package com.test.java;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;

import com.main.java.Calculator;

@RunWith(value = Parameterized.class)
public class CalculatorTest {

    @Parameterized.Parameters
    public static Collection<Integer[]> getParameters() {
        return Arrays.asList(new Integer[][] { { 5, 3, 2 }, // expected, para1,
                                                            // para2
                { 3, 1, 2 }, // expected, para1, para2
                { 2, 1, 1 } // expected, para1, para2
                });
    }

    private Calculator calculator;

    private int expected;
    private int para1;
    private int para2;

    public CalculatorTest(int expected, int para1, int para2) {
        this.expected = expected;
        this.para1 = para1;
        this.para2 = para2;
    }

    @Ignore("尚未定義...")
    @Test
    public void test() {
        // fail("Not yet implemented");

    }

    @Test(timeout = 2000)
    public void testPlus() {
        // int expected = 5;
        int result = calculator.plus(para1, para2);
        assertEquals(expected, result);
    }

    @Test
    public void testMinus() {
        int expected = 2;
        int result = calculator.minus(4, 2);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        int expected = 6;
        int result = calculator.multiply(2, 3);
        assertEquals(expected, result);
    }

    @Test(timeout = 2000)
    public void testDivide() {
        int expected = 3;
        int result = calculator.divide(6, 2);
        assertEquals(expected, result);
    }

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    public static void main(String[] args) {
        /*
         * 自定義輸入格式
         */
        Result result = JUnitCore.runClasses(CalculatorTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.print(failure.getTestHeader() + "： "
                    + failure.getMessage());
        }
    }

}
