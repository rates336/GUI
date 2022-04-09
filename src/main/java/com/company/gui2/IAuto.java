package com.company.gui2;

public interface IAuto {
    default void Move(String way) {
        if(way.equals("road"))
            System.out.println("We can move, way is correct");
        else
            System.out.println("Way is incorrect, change method transport");
    }
}
