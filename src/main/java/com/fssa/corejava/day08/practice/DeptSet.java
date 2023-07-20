package com.fssa.corejava.day08.practice;

import java.util.*;

public class DeptSet {
    public static void main(String[] args) {
        String[] ar = { "HR,Ram", "HR,Suresh", "IT,Basker", "IT,Joseph", "Admin,Sundar" };
        
        Map<String ,ArrayList<String>> list = new HashMap<>();

        for (String i : ar) {
            String[] temp = i.split(",");
            String dept = temp[0];
            String emp = temp[1];
            if (list.containsKey(dept)) {
                ArrayList<String> elist = list.get(dept);
                elist.add(emp);
                list.put(dept, elist);
            } else {
                ArrayList<String> elist = new ArrayList<>();
                elist.add(emp);
                list.put(dept, elist);
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry : list.entrySet()) {
            String key = entry.getKey();
            ArrayList<String> elist = entry.getValue();
            System.out.println(key + ": " + elist);
        }
            
    }
    
}
