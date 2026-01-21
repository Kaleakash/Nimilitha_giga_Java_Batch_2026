package com.executorserviceexamples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Callable<String>{
	@Override
	public synchronized String call() throws Exception {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("In Call method "+t);
		return t.getName();
	}
}
class Task1 implements Runnable {
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
	System.out.println("Run method "+t);	
	}
}
public class ExecutorServiceExamples {

	public static void main(String[] args) throws Exception{
//		Task1 tt1 = new Task1();
//		
//		
//		for(int i=0;i<=10;i++) {
//			Thread thread1 = new Thread(tt1);
//		thread1.start();
//		}
		
		Task tt = new Task();
//		//ExecutorService es = Executors.newSingleThreadExecutor(); // 1 thread to do 10 task.
//		//ExecutorService es = Executors.newFixedThreadPool(3);		// 3 thread to do 10 task 
		ExecutorService es = Executors.newCachedThreadPool();		// if required then only it will create new thread. 
//		
		for(int i=1;i<=10;i++) {
			es.submit(tt);
			//es.execute(rr);	no return type it takes only runnable no callable 
		}
		
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);
		for(int i=1;i<=10;i++) {
			ses.schedule(tt, 2, TimeUnit.SECONDS);
		}
		
		//ses.awaitTermination(2, TimeUnit.SECONDS);
		//ses.do
	}

}
