package com.threadfactoryexamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class CustomThreadFactory implements ThreadFactory {

    private int count = 1;

    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName("Worker-Thread-" + count++);
        t.setPriority(Thread.NORM_PRIORITY);
        return t;
    }
}


public class ThreadFactoryExamples {

	public static void main(String[] args) {
		  ExecutorService service = Executors.newFixedThreadPool(2,new CustomThreadFactory());

	        service.execute(() ->System.out.println(Thread.currentThread().getName()));

	        service.execute(() ->System.out.println(Thread.currentThread().getName()));

	        service.shutdown();


	}

}
