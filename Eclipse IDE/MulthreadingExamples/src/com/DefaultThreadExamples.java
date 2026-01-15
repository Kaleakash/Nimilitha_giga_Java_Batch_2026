package com;

public class DefaultThreadExamples {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Demo Thread");
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
		int i = t.getPriority();
		String name = t.getName();
		ThreadGroup tg = t.getThreadGroup();
		System.out.println(i);
		System.out.println(name);
		System.out.println(tg);
	}

}
