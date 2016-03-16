package com.autumnstudio.other;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

/*
 * System 系统类，主要用于获取系统的属性值
 * -- arrayCopy方法 arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
 * -- currentTimeMillis() 返回以毫秒为单位的当前时间
 * -- exit(int status) 终止当前正在运行的 Java 虚拟机。
 * -- gc() 运行垃圾回收器。  *** 建议JVM立即启动垃圾回收器
 * -- getenv() 返回一个不能修改的当前系统环境的字符串映射视图。
 * -- getProperties() 确定当前的系统属性。
 */
public class Demo1 {
	public static void main(String[] args) {
		int[] src = {10, 20, 30, 40, 50, 60, 70};
		int[] dest = new int[4];
		
		System.arraycopy(src, 1, dest, 0, 4);
		System.out.println(Arrays.toString(dest));
		
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date(System.currentTimeMillis()));
		
		new Demo();
		System.gc();
		
		String paths = System.getenv("path");
		String[] arrPaths = paths.split(";");
		File[] files = new File[arrPaths.length];
		for (int i = 0; i < arrPaths.length; i ++) {
			files[i] = new File(arrPaths[i]);
			System.out.println(files[i].getAbsolutePath());
		}
		
		Properties props = System.getProperties();
		props.list(System.out);
	}
}

class Demo {
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("垃圾回收");
	}
}