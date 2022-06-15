package com.company.gui4;

import java.util.HashSet;

public class Task2 {
    HashSet<Integer> heraKokaHashLSD = new HashSet<>();

    public void setFiller() {
        heraKokaHashLSD.add(31);
        heraKokaHashLSD.add(28);
        heraKokaHashLSD.add(31);
        heraKokaHashLSD.add(30);
    }

    public static void main(String[] args) {
        Task2 t2 = new Task2();
        t2.setFiller();
        t2.heraKokaHashLSD.stream().forEach(System.out::println);
        //HashSet do not store duplicates
    }
}
