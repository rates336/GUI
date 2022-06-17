package com.company.gui5;

public class Letters extends Thread {
    private String lettersToSout;
    private int numberOfThreadsToStart;
    private int counterOfSouted;


    public Letters(String lettersToSout, int numberOfThreadsToStart) {
        this.lettersToSout = lettersToSout;
        this.numberOfThreadsToStart = numberOfThreadsToStart;
        counterOfSouted = 0;
    }

    public Letters(String lettersToSout) {
        this.lettersToSout = lettersToSout;

    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(lettersToSout);
                counterOfSouted++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Process finished ");
        }

    }

    public Thread[] getNumberOfThreadsToStart() {
        Thread[] tabOfThreads = new Thread[numberOfThreadsToStart];
        for (int i = 0; i < tabOfThreads.length; i++) {
            tabOfThreads[i].setName("Thread nr: " + i);
        }
        return tabOfThreads;
    }

    public int getCounterOfSouted() {
        return counterOfSouted;
    }
}
