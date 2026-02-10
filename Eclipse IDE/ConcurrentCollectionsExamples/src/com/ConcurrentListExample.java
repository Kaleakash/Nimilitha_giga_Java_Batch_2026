package com;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ConcurrentListExample {
    public static void main(String[] args) {

    		//ArrayList<String> list = new ArrayList<String>();
//        CopyOnWriteArrayList<String> list =
//                new CopyOnWriteArrayList<>();
    	CopyOnWriteArraySet<String> list = new CopyOnWriteArraySet<>();

        list.add("CONFIG_1");
        list.add("CONFIG_2");

        for (String value : list) {
            list.add("NEW_CONFIG ");
            System.out.println(value);
        }

        System.out.println("Final List: " + list);
    }
}

