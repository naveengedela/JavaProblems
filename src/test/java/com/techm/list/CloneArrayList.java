package com.techm.list;

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1  = new ArrayList<String>();
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");

        ArrayList c2 = (ArrayList) c1.clone();
        System.out.println(c2);
    }
}
