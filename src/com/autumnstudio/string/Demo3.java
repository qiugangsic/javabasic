package com.autumnstudio.string;

/*
 * ����String�Ļ�ȡ����
 */
public class Demo3 {
	public static void main(String[] args) {
		String str1 = "abcde";
		System.out.println("�ַ����ĳ�����" + str1.length());
		int[] arr = new int[2];
		System.out.println("����ĳ�����" + arr.length);
		
		System.out.println(str1.charAt(2));
		
		System.out.println(str1.indexOf("bc"));
		System.out.println(str1.indexOf("ef")); //�Ҳ�������-1
		System.out.println(str1.lastIndexOf("bc"));
	}
}
