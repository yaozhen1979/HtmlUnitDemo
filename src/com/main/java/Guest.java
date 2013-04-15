package com.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guest {

    public List<String> generateName() {

        List<String> guestList = new ArrayList<String>();

        // "Justin", "Momor", "Hamimi"
        guestList.add("Justin");
        guestList.add("Momor");
        guestList.add("Hamimi");
        guestList.add("Tony");
        guestList.add("Apple");

        return guestList;
    }
    
    public List<Integer> generateAge() {
        
        List<Integer> ageList = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            ageList.add(new Random().nextInt(5));
        }
        
        return ageList;
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(5) + 1);
        }
    }

}
