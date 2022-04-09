package com.company.gui3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TheRandClass {
    List<Double> theList = new LinkedList<>();
    Random ran = new Random();
    public void listFiller(int quantity) {
        for (int i = 0; i < quantity; i++) {
            theList.add(ran.nextDouble() + ran.nextInt(98) + 1);
        }
        System.out.println("Operation finished");
    }

    public List<Double> getTheList() {
        return theList;
    }
}
