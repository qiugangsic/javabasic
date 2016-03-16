package com.autumnstudio.string;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		//replace
		String str = "�������ϲ����ԣ�";
		System.out.println(str.replace('��', 'Ҫ'));
		System.out.println(str.replace("����", "����"));
		
		//split
		String str1 = "��-��-��-��-��";
		String[] arr = str1.split("-");
		System.out.println(Arrays.toString(arr));
		
		//subString
		String str2 = "���칤����";
		System.out.println(str2.substring(2));
		System.out.println(str2.substring(0, 2)); //��ͷ����β
		
		//trim
		String str3 = "      abc de        ";
		System.out.println(str3.trim());
	}
}
