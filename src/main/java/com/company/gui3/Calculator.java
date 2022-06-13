package com.company.gui3;


import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.*;

public class Calculator <T extends  Number> {
    T number;
    T number2;

    public Calculator(T number, T number2) {
        this.number = number;
        this.number2 = number2;
    }

/*    public static <T extends  Number> void calculate(T number) {
        double result = number.doubleValue();
        System.out.println(result);
    }*/
    public void calculate() {
        System.out.println(number.doubleValue() * number2.doubleValue());
    }




}
