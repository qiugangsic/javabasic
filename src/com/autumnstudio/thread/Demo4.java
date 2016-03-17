package com.autumnstudio.thread;

public class Demo4 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		System.out.println(Thread.currentThread());
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		this.setName("MyThread");
		System.out.println(Thread.currentThread());
	}
}