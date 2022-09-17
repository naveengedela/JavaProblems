package com.techm.list;

import java.util.ArrayList;

public class IncreaseTheSizeOfList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>(3);
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");
        c1.add("5");
        System.out.println(c1);

        c1.ensureCapacity(10);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);
    }
}
