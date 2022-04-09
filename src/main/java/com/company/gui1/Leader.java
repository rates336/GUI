
package com.company.gui1;


public class Leader extends Hero {
    public Leader(String name, int number) {
        super.name = name;
        super.number = number;
    }

    @Override
    public String toString() {
        return "Leader: " +
                super.toString();
    }
}

