package com.autumnstudio.thread;

public class Demo_Runnable {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		Thread t = new Thread(mt, "我的线程");
		
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThread1 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getClass());
		System.out.println(this.getClass());
	}
}