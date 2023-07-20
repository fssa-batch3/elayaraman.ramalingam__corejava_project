package com.fssa.corejava.day08.practice;

import java.util.*;

public class NameSet {
    public static void main(String[] args) {
        String str = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";
        String[] ar = str.split(",");
        Map<String, Integer> count = new HashMap<>();
        for (String i : ar) {
            i = i.trim();
            if (count.containsKey(i)) {
                int temp = count.get(i);
                count.put(i, temp + 1);
            } else {
                count.put(i, 1);
            }

        }
        for(Map.Entry<String, Integer> entry : count.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+" "+value);
        }

    }
    
}
