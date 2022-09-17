package com.techm.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("infosys");
        list1.add("mahindra");
        list1.add("microsoft");
        list1.add("apple");
        Collections.shuffle(list1);
        System.out.println(list1);
    }
}
