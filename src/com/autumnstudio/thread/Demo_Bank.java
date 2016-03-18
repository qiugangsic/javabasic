package com.autumnstudio.thread;

public class Demo_Bank {
	public static void main(String[] args) {
		BankThread t1 = new BankThread("老公");
		BankThread t2 = new BankThread("老婆");

		t1.start();
		t2.start();
	}
}

class BankThread extends Thread {
	static int count = 5000;

	public BankThread(String name) {
		super(name);
	}

	@Override
	/*
	 * public void run() { while (true) { synchronized("锁") { if (count > 0) {
	 * System.out.println(Thread.currentThread().getName() + "取走了1000元，还剩余" +
	 * (count -1000) + "元"); count = count - 1000; try { Thread.sleep(100); }
	 * catch (InterruptedException e) { e.printStackTrace(); } } else {
	 * System.out.println("取光了"); break; } } } }
	 */
	public void run() {
		getMoney();
	}

	synchronized private void getMoney() {
		while (true) {
			if (count > 0) {
				System.out.println(Thread.currentThread().getName() + "取走了1000元，还剩余" + (count - 1000) + "元");
				//System.out.println(this.getName());
				count = count - 1000;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("取光了");
				break;
			}
		}
	}
}