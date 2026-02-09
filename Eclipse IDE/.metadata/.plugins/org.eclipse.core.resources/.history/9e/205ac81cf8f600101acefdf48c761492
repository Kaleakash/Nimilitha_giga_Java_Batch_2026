package com.advsynchronization;
import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    AtomicInteger count = new AtomicInteger(0);
	//static int count=0;
    void increment() {
        count.incrementAndGet();
    	//count++;
    }
}


public class AtomIntegerExamples {

		public static void main(String[] args) throws InterruptedException {

	        AtomicCounter c = new AtomicCounter();

	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) c.increment();
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) c.increment();
	        });

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        System.out.println("Final count: " + c.count.get());
	       // System.out.println(AtomicCounter.count);

	}

}
