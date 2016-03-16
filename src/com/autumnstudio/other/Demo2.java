package com.autumnstudio.other;

/*
 * Runtime¿‡
 * -- getRuntime 
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		Runtime run = Runtime.getRuntime();
		
		run.traceMethodCalls(true);
		
		Process p = run.exec("c:\\windows\\notepad.exe");
		Thread.sleep(3000);
		p.destroy();
		
		System.out.println(run.availableProcessors());
		
		System.out.println(run.totalMemory());
		System.out.println(run.maxMemory());
		System.out.println(run.freeMemory());
	}
}
