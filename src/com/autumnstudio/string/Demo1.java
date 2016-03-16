package com.autumnstudio.string;

public class Demo1 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.println("str1==str2? " + (str1 == str2));
		System.out.println("str2==str3? " + (str2 == str3));
		System.out.println("str3==str4? " + (str3 == str4));
		System.out.println("str3 equals str4? " + (str1.equals(str4)));
		//"=="用于比较引用数据类型的时候是比较两个对象的内存地址，equals方法默认也是比较两个对象的地址。
		//所以需要重写对象的equals方法，来比较引用类型的数据类型的对象。
		
		test("中国");
		test("美国");
	}
	
	public static void test(String str) {
		if ("中国".equals(str)) {
			System.out.println("正确");
		}else{
			System.out.println("回答错误");
		}
	}
}
