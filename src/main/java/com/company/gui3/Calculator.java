package com.company.gui3;


import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.*;

public class Calculator <T extends  Number> {
    T number;

    public Calculator(T number) {
        this.number = number;
    }

/*    public static <T extends  Number> void calculate(T number) {
        double result = number.doubleValue();
        System.out.println(result);
    }*/
    public void calculate() {
        double result = pow(number.doubleValue(), 2);
        System.out.println(result);
    }

    public static void main(String[] args) {
    Calculator<Double> theCalc = new Calculator<>(31.31);
    theCalc.calculate();
    ICalc myAdd = (a, b) -> {
        double result = a + b;
        System.out.println(result);
        return result;
    };
    ICalc mySubtract = (a, b) -> {
        double result = a - b;
        System.out.println(result);
        return result;
    };
    ICalc myMultiply = (a, b) -> {
        double result = a * b;
        System.out.println(result);
        return result;
    };
    ICalc myDivide = (a, b) -> {
        double result = a / b;
        System.out.println(result);
        return result;
    };
    myAdd.calcDouble(31, 98.3);
    mySubtract.calcDouble(31, 98.3);
    myMultiply.calcDouble(31, 98.3);
    myDivide.calcDouble(31, 98.3);

    TheRandClass someName = new TheRandClass();
    someName.listFiller(10);
        for (int i = 0; i < someName.theList.size(); i++) {
            System.out.println(someName.theList.get(i));
        }
        for (int i = 0; i < calculate(someName.theList, myAdd).size(); i++) {
            System.out.println("ICalc value: ");
        }

    }

    public static List<Double> calculate(List<Double> list, ICalc iCalc) {
        List<Double> resultList = new LinkedList<>();
        for (int i = 0; i < list.size() / 2; i+=2) {
            resultList.add(iCalc.calcDouble(i, i+1));
        }
        return resultList;
    }


}
