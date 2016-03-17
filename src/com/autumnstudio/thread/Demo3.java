package com.autumnstudio.thread;
/*
 * 线程常用方法
 * -- Thread(String name)
 * -- getName()
 * -- setName(String name)
 * -- sleep()
 * -- getPriority
 * -- setPriority
 * -- currentThread
 */
public class Demo3 {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread();
		System.out.println("线程的名称：" + t.getName());
		t.setName("新线程1");
		System.out.println("线程的名称：" + t.getName());
		System.out.println("线程的优先级：" + t.getPriority());
		t.setPriority(10);
		System.out.println("线程的优先级：" + t.getPriority());
		System.out.println("线程睡眠");
		Thread.sleep(3000);
		System.out.println("线程醒了");
		
		System.out.println(Thread.currentThread());
	}
}
