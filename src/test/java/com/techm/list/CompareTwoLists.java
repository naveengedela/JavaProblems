package com.techm.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTwoLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        System.out.println(list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        System.out.println(list2);

        ArrayList<String> c3 = new ArrayList<String>();
        for(String e: list1){
            c3.add(list2.contains(e) ? "Yes": "No");
        }
        System.out.println(c3);
    }
}
