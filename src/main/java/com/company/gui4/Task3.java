package com.company.gui4;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Task3 {
    Map<String, Integer> daysOfMonthMap = new HashMap<>();
    List<String> listNamesOfMonths = new ArrayList<>();

    public void mapFiller() {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.set(calendar.get(Calendar.YEAR), 1, calendar.get(Calendar.DAY_OF_MONTH));
            listNamesOfMonths.add("January");
            listNamesOfMonths.add("February");
            listNamesOfMonths.add("March");
            listNamesOfMonths.add("April");
            listNamesOfMonths.add("May");
            listNamesOfMonths.add("June");
            listNamesOfMonths.add("July");
            listNamesOfMonths.add("August");
            listNamesOfMonths.add("October");
            listNamesOfMonths.add("September");
            listNamesOfMonths.add("November");
            listNamesOfMonths.add("December");

        for (int i = 0; i < 12; i++) {
            calendar.set(calendar.get(Calendar.YEAR),1 + i, calendar.get(Calendar.DAY_OF_MONTH));
            daysOfMonthMap.put(listNamesOfMonths.get(calendar.get(Calendar.MONTH)), calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        }
    }

    public void show() {
        //List<Object> keysMapList = Arrays.stream(daysOfMonthMap.keySet());

    }

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        t3.mapFiller();
        System.out.println(t3.daysOfMonthMap.get(t3.listNamesOfMonths.get(2)));
    }
}
