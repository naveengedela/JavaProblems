package com.techm.list;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10);
        ll1.add(14);
        ll1.add(45);
        System.out.println(ll1);
        LinkedList<Integer> ll2 = new LinkedList<>();
        // It will mute the linked list
//        Collections.reverse(ll1);
        System.out.println(ll1);
        ll1.descendingIterator().forEachRemaining(ll2::add);
        System.out.println(ll2);
    }
}
