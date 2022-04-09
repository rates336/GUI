package com.company.gui2;

public interface IBoat {
    default void Move(String way) {
        if(way.equals("water"))
            System.out.println("We can move, way is correct");
        else
            System.out.println("Way is incorrect, change method transport");
    }
}
