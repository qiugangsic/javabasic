package com.autumnstudio.string;

/*
 * 测试String的获取方法
 */
public class Demo3 {
	public static void main(String[] args) {
		String str1 = "abcde";
		System.out.println("字符串的长度是" + str1.length());
		int[] arr = new int[2];
		System.out.println("数组的长度是" + arr.length);
		
		System.out.println(str1.charAt(2));
		
		System.out.println(str1.indexOf("bc"));
		System.out.println(str1.indexOf("ef")); //找不到返回-1
		System.out.println(str1.lastIndexOf("bc"));
	}
}