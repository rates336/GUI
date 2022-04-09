package com.company.gui2;

import java.lang.Math;

public class Square implements Comparable<Square> {
    int length, number;
    public static int counter = 0;

    public Square(int length) {
        this.length = length;
        counter++;
        number = counter;
    }

    public int getArea() {
        return (int)Math.pow(length, 2);
    }

    @Override
    public String toString() {
        return "Square number: " + number +
                "\tlength=" + length +
                ", area=" + getArea();
    }

    @Override
    public int compareTo(Square o) {
        return 0;
    }
}