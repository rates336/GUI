package com.company.gui2;

import java.lang.Math;

public class Square implements Comparable<Square> {
    int length, number;
    public static int counter;

    public Square(int length) {
        this.length = length;
    }

    public int getArea() {
        return (int)Math.pow(length, 2);
    }

    @Override
    public String toString() {
        return "Square:" +
                "length=" + length +
                ", number=" + number;
    }

    @Override
    public int compareTo(Square o) {
        return 0;
    }
}
/*
    Stwórz klasęSquarez polamiint length, numberorazstatic int counter. Napisz konstruktor,który jako argument
    otrzymuje int length oraz inicjuje odpowiednio pola. Napisz metodęgetAreaoraz nadpisz metodętoStringtak,
    aby zwracała number oraz areaW deklaracji klasy Square dodaj interfaceCopmerable<Square>i tym samym
    zaimplementujmetodę compareToW metodzie main stwórz 5 obiektów klasy Square i dodaj je do listy. Następnie
    wypisz je na konsoli,posortuj używając metody sort z klasy Collections i wypisz je ponownie na konsoli.

    II. Utwórz InterfaceIMoveorazISpeaknastępnie połącz je w InterfejsieIAnimalBehaviors.
    Utwórzklasę zwierzę, która wykorzysta interfejs.

    III. Przygotuj interfejsIAutoorazIBoat.
    W interfejsach tych utwórz metodędefault void Move()która odpowiednio będzie poruszała tymi pojazdami.
    Następnie utwórz 3 klasy Auto, Boat orazAmphibious. Pamiętaj o rozwiązaniu problemu w przypadku klasy
    Amphibious która musi imple-mentować oba interfejsy i poruszać się zależnie od powierzchni.*/
