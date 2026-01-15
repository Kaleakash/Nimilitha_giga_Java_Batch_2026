package com.gaming;
class Car implements Runnable{
	@Override
	public void run() {
	String name = Thread.currentThread().getName();
		for(int i=0;i<=10;i++) {
			System.out.println(name+" is moving with speed as "+(50+i)+"km/hr");
				try {
				Thread.sleep(500);
				}catch(Exception e) {}
		}
	}
}
class Bike implements Runnable{
	@Override
	public void run() {
	String name = Thread.currentThread().getName();
		for(int i=0;i<=15;i++) {
			System.out.println(name+" is moving with speed as "+(50+i)+"km/hr");
				try {
				Thread.sleep(500);
				}catch(Exception e) {}
		}
	}
}
public class GamingApp {

	public static void main(String[] args) throws Exception{
		Car cc = new Car();
		Bike bb = new Bike();
		Thread t1 = new Thread(cc);
		Thread t2 = new Thread(cc);
		Thread t3 = new Thread(cc);
		Thread t4 = new Thread(cc);
		Thread t5 = new Thread(bb);
		Thread t6 = new Thread(bb);
					t1.setName("Car 1");
		t2.setName("Car 2");
		t3.setName("Car 3");
		t4.setName("Car 4");
		t5.setName("Bike 1");
		t6.setName("Bike 2");
//		System.out.println("status "+t1.isAlive());
//		System.out.println("status "+t2.isAlive());
//		System.out.println("status "+t3.isAlive());
//		System.out.println("status "+t4.isAlive());
		Thread.sleep(1000);
		System.out.println("1....");
		Thread.sleep(1000);
		System.out.println("2....");
		Thread.sleep(1000);
		System.out.println("3....");
		Thread.sleep(2000);
		System.out.println("Game Start");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
//		System.out.println("status "+t1.isAlive());
//		System.out.println("status "+t2.isAlive());
//		System.out.println("status "+t3.isAlive());
//		System.out.println("status "+t4.isAlive());
		t1.join();   // line 47 execute after t1 task finishś
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		System.out.println("Game End...");
	}

}
