package com.company.gui3;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Calculator<Double> calc1 = new Calculator<>(10.5,15.0);
        Calculator<Integer> calc2 = new Calculator<>(13, 5);
        Calculator<Float> calc3 = new Calculator<>(13.3F, 2.5F);
        Calculator<Long> calc4 = new Calculator<>(31313L, 931L);
        Calculator<Short> calc5 = new Calculator<Short>((short) 31, (short) 6);
        //Calculator<Short> calc6 = new Calculator<Short>(31, 6);
        //Why this implementation is not correct?
        calc1.calculate();
        calc2.calculate();
        calc3.calculate();
        calc4.calculate();
        calc5.calculate();

        Calculator<Double> theCalc = new Calculator<Double>(31.30, 13.5);
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
        System.out.println("ICalc value: ");
        for (int i = 0; i < calculate(someName.theList, myAdd).size() / 4; i++) {
        }
        System.out.println("ICalc value: ");
        for (int i = 0; i < calculate(someName.theList, mySubtract).size() / 4; i++) {
        }
        System.out.println("ICalc value: ");
        for (int i = 0; i < calculate(someName.theList, myMultiply).size() / 4; i++) {
        }
        System.out.println("ICalc value: ");
        for (int i = 0; i < calculate(someName.theList, myDivide).size() / 4; i++) {
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
