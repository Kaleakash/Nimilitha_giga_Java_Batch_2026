package com;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class NonConcurrentListProblem {
    public static void main(String[] args) throws Exception {
    	List<Integer> list = new ArrayList<>();
    //	CopyOnWriteArrayList<Integer> list =
                new CopyOnWriteArrayList<>();
        Runnable task = () -> {
            synchronized (list) {
        		for (int i = 0; i < 1000; i++) {       
            		list.add(i);
            }
			}

        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Expected: 2000, Actual: unpredictable
        System.out.println("Final size: " + list.size());
    }
}

