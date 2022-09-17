package com.techm.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("red");
        list_strings.add("blue");
        list_strings.add("yellow");
        list_strings.add("green");

        System.out.println(list_strings);
        list_strings.add(0, "rainbow");
        list_strings.add(5, "grey");
        System.out.println(list_strings);

        list_strings.set(2, "maroon");
        System.out.println(list_strings);

        list_strings.remove(3);
        System.out.println(list_strings);

        if(list_strings.contains("red")){
            System.out.println("Found the element");
        }
        else {
            System.out.println("There is no such element");
        }

        Collections.sort(list_strings);
        System.out.println(list_strings);

    }
}
