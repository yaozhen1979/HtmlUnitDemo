package com.test.java;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import com.main.java.Guest;

public class GuestTest {

    private Guest guest;

    @Before
    public void setUp() throws Exception {
        guest = new Guest();
    }

    @After
    public void tearDown() throws Exception {
        guest = null;
    }

    @Test
    public void testGenerateName() {
        List<String> nameList = guest.generateName();
        // assertTrue(guests.contains("Justin") && guests.contains("Momor")
        // && guests.contains("Hamimi"));
        assertThat(nameList, JUnitMatchers.hasItems("Justin", "Momor", "Hamimi"));
    }
    
    @Test
    public void testGenerateAge() {
        List<Integer> ageList = guest.generateAge();
        // assertTrue(ageList.get(0) < 5 && ageList.get(1) < 5
        // && ageList.get(2) < 5 && ageList.get(3) < 5
        //      && ageList.get(4) < 5);
        assertThat(ageList , JUnitMatchers.everyItem(Matchers.lessThan(5)));
    }

}
