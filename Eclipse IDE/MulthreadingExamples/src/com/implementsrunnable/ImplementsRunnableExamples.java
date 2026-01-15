package com.implementsrunnable;
class A implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			Thread t = Thread.currentThread();
			System.out.println("i "+i+" "+t);
		}
	}
}
class B implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<=10;j++) {
			Thread t = Thread.currentThread();
			System.out.println("j "+j+" "+t);
		}
	}
}
public class ImplementsRunnableExamples {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
//		obj1.run();
//		obj2.run();
		Thread t1 = new Thread(obj1);		// we need to pass the object that class which implements Runnable 
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		

	}

}
