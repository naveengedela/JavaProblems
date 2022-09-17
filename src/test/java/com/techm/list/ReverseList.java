package com.techm.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("c");
        System.out.println("Before reverse "+ list);
        Collections.reverse(list);
        System.out.println("After reverse"+ list);
    }
}
