package com.autumnstudio.string;

/*
 * String���жϷ���
 * String��ת������
 * 	toCharArrey
 * 	getBytes
 */
public class Demo4 {
	public static void main(String[] args) {
		String fileName = new String("d:\\development\\java\\jdk.chm");
		System.out.println("�Ƿ���.java������ " + fileName.endsWith(".java"));
		System.out.println("�Ƿ���.chm������ " + fileName.endsWith(".chm"));
		
		System.out.println(fileName.isEmpty());
		
		System.out.println(fileName.contains("java"));
		
		//equals �ж��Ƿ����
		//equalsIgnoreCase ���Դ�Сд�ж��Ƿ����
		
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
