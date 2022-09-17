package com.techm.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        System.out.println(list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        System.out.println(list2);
        Collections.copy(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
