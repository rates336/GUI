package com.company.gui5;

public class Task2 {
    public static void main(String[] args) throws InterruptedException{
        Letters letters = new Letters("ęśąćż", 5);
        /*for (Thread t: letters.getNumberOfThreadsToStart()
             ) {
            *//*System.out.println(t.getName());
            t.start();
            *//**//*Thread.sleep(2000);
            if(letters.getCounterOfSouted() == 10) {
                System.out.println("Program finish work");
                System.out.println(letters.getCounterOfSouted());
            }*//*
        }*/
        letters.start();

    }
}
