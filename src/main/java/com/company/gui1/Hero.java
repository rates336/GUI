package com.company.gui1;

public class Hero {
    String name;
    int number;


    public Hero(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Hero() {

    }

    public void sayHelloTo(Hero hero) {
        System.out.println("Hi hi hello " + hero);
    }


}
