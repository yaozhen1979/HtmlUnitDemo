package com.test.junitcookbook;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestOne {

    @Test
    public void simpleAdd() {
        int a = 1;
        int b = 2;
        int c = a + b;
        assertTrue(c == 3);
    }

}
