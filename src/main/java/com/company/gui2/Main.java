package com.company.gui2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Square> list = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(new Square(i + ran.nextInt(10)));
        }
        for (Square square : list) {
            System.out.println(square.toString());
        }
        System.out.println();
        Collections.sort(list);
        for (Square square : list) {
            System.out.println(square.toString());
        }
        new Auto().Move("water");
        new Boat().Move("water");
        new Amphibious().Move("road");

    }
}
