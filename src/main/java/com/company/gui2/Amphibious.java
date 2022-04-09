package com.company.gui2;

public class Amphibious implements IAuto, IBoat{
    @Override
    public void Move(String way) {
        if(way.equals("road") || way.equals("water"))
            System.out.println("Way is correct, we can move");
        else
            System.out.println("Way is incorrect, change method transport");
    }
}
