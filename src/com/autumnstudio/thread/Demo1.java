package com.autumnstudio.thread;
/*
 * 进程：正在执行的程序，称之为进程，进程负责内存等系统资源的分配
 * 线程：在一个进程中负责代码的执行，代码的一个执行路径
 * 多线程：在一个进程中有多个线程在同时运行，执行不同的任务
 * 一个Java程序至少有二个线程，main线程和垃圾回收器线程
 * 创建线程
 * 	-- 方式一
 * 		继承Thread类，重写run方法
 * 	-- 方法二
 * 		实现Runnable接口，重写run方法，以此类作为参数创建Thread类对象
 */
public class Demo1 extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.activeCount());
		
		Thread t = new Demo1();
		t.start();
	}
}
