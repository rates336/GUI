package com.company.gui5;

public class Runner extends Thread {
    private int upperLimit;
    private int startNumber;
    private String name;

    public Runner(int upperLimit, String name) {
        this.upperLimit = upperLimit;
        this.name = name;
        startNumber = 0;
    }
    public Runner(int upperLimit, int startNumber, String name) {
        this.upperLimit = upperLimit;
        this.startNumber = startNumber;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = startNumber; i < upperLimit; i++)
            System.out.println(name + " " + i);
    }
}
