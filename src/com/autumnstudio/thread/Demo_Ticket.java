package com.autumnstudio.thread;

/*
 * 线程安全问题
 * 1、什么情况下出现
 * 		两个或以上的线程对象而且线程之间共享资源
 * 2、有多个语句操作了公共资源
 * 解决方案：同步机制
 * 		方式一：同步代码块
 * 		方式二：同步函数
 * 
 * synchronized 关键字
 * 		synchronized(锁对象) {  } 锁对象可以是任一的一个对象,必须是引用类型
 */
public class Demo_Ticket {
	public static void main(String[] args) {
		SaleTicket t1 = new SaleTicket("一号窗口");
		SaleTicket t2 = new SaleTicket("二号窗口");
		SaleTicket t3 = new SaleTicket("三号窗口");

		t1.start();
		t2.start();
		t3.start();
	}
}

class SaleTicket extends Thread {
	private static int num = 500;
	private static Object o = new Object();

	public SaleTicket(String name) {
		super(name);
	}

	@Override
	public void run() {
			while (true) {
				synchronized(o) {
					if (num > 0) {
						System.out.println(this.getName() + "售出" + num + "号票。");
						num--;
					} else {
						System.out.println("票卖完了！");
						break;
					}
				}
		}
	}
}