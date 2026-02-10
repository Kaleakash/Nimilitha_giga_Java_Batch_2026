package com;

import java.util.HashMap;
import java.util.concurrent.*;

public class ConcurrentMapExample {
    public static void main(String[] args) throws Exception {

        ConcurrentHashMap<Integer, Integer> sessions =
                new ConcurrentHashMap<>();

    		//HashMap<Integer, Integer> sessions = new HashMap<Integer, Integer>();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                sessions.put(i, i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Total sessions: " + sessions.size());
    }
}

