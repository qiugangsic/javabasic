package com.autumnstudio.thread;
/*
 * 需求：模拟视频与聊天同时进行
 * 
 */

class VideoThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("视频视频");
		}
	}
}

class TalkThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("聊天聊天");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Thread t1 = new VideoThread();
		Thread t2 = new TalkThread();
		
		t1.start();
		t2.start();
	}
}
