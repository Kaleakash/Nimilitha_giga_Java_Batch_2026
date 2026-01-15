package com.synchronization;
class Booking implements Runnable{
	int avl=3;
	@Override
	public synchronized void run() {
	String name = Thread.currentThread().getName();
	if(avl>0) {
		System.out.println(name+" got the tiket");
		avl = avl-1;
	}else {
		System.out.println(name+"sorry no ticket");
	}
	
	}
}
public class SynchronizationExamples {
	public static void main(String[] args) {
		Booking b1 = new Booking();		// avl=3
		//Booking b2 = new Booking();		//avl=3
		//Booking b3 = new Booking();		// avl=3
	//	Booking b4 = new Booking();		//avl=3
	//	Booking b5 = new Booking();		// avl=3
		Thread t1 = new Thread(b1,"Ravi");
		Thread t2 = new Thread(b1,"Raj");
		Thread t3 = new Thread(b1,"Ramesh");
		Thread t4 = new Thread(b1,"Ram");
		Thread t5 = new Thread(b1,"Rajesh");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
