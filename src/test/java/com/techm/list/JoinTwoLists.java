package com.techm.list;

import java.util.ArrayList;

public class JoinTwoLists {
    public static void main(String[] args) {
        ArrayList<String> c1  = new ArrayList<String>();
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("a");
        c2.add("b");
        c2.add("c");

        ArrayList<String> c3 = new ArrayList<String>();
        c3.addAll(c1);
        c3.addAll(c2);
        System.out.println(c3);
    }
}
