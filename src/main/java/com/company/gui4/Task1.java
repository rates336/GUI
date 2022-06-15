package com.company.gui4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Task1 {
    List<String> list = new ArrayList<>();
    public void listFiler() {
        list.add("Ala");
        list.add("ma");
        list.add("Kota");
        list.add("a");
        list.add("Kot");
        list.add("ma");
        list.add("Ale");
    }
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        t1.listFiler();
        System.out.println("List size: " + t1.list.size());
        for (String temp:
                t1.list) {
            System.out.println(temp);
        }
        t1.list = t1.list.stream()
                .map(e -> e.toUpperCase(Locale.ROOT)).toList();

        t1.list.stream().filter(e -> e.endsWith("A")).forEach(System.out::println);
    }

}
