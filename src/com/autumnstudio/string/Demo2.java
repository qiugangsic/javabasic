package com.autumnstudio.string;

public class Demo2 {
	public static void main(String[] args) {
		String str = new String();
		byte[] buf = {97, 98, 99};
		String str1 = new String(buf); //ʹ���ַ����鹹��String����
		String str2 = new String(buf, 1, 2);
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		char[] arr = {'��', '��', '��', 'ʥ', '��', '��'};
		String str3 = new String(arr);
		String str4 = new String(arr, 3, 3);
		System.out.println(str3);
		System.out.println(str4);
		
		int[] arr1 = {65, 66, 67};
		String str5 = new String(arr1, 0, 3);
		System.out.println(str5);
	}
}
