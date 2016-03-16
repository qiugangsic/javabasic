package com.autumnstudio.string;

/*
 * String的判断方法
 * String的转换方法
 * 	toCharArrey
 * 	getBytes
 */
public class Demo4 {
	public static void main(String[] args) {
		String fileName = new String("d:\\development\\java\\jdk.chm");
		System.out.println("是否以.java结束？ " + fileName.endsWith(".java"));
		System.out.println("是否以.chm结束？ " + fileName.endsWith(".chm"));
		
		System.out.println(fileName.isEmpty());
		
		System.out.println(fileName.contains("java"));
		
		//equals 判断是否相等
		//equalsIgnoreCase 忽略大小写判断是否相等
		
		String str1 = "abc";
		String str2 = "ABC";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		char[] arr1 = fileName.toCharArray();
		byte[] arr2 = fileName.getBytes();
		System.out.println(arr1);
		System.out.println(arr2);
		for (byte b : arr2) {
			System.out.print((char)b);
		}
		System.out.println(arr2.toString());
		
	}
}
