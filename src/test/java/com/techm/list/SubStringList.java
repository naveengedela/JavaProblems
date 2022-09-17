package com.techm.list;

import java.util.ArrayList;
import java.util.List;

public class SubStringList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();

        list1.add("while");
        list1.add("for");
        list1.add("function");
        list1.add("break");
        list1.add("Orange");
        list1.add("White");
        list1.add("Black");
        List<String> subList = list1.subList(2, list1.size() - 1);
        System.out.println(subList);
    }
}
