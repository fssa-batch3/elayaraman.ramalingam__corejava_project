package com.fssa.corejava.day09.practice;

import java.util.*;

public class SortNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.addAll(Arrays.asList(2, 5, 1, 4, 6, 4, 2, 3, 5, 6));

        Collections.sort(list);

        System.out.println(list);
    }

}
