package com.autumnstudio.string;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		//replace
		String str = "今天晚上不考试！";
		System.out.println(str.replace('不', '要'));
		System.out.println(str.replace("今天", "明天"));
		
		//split
		String str1 = "大-家-下-午-好";
		String[] arr = str1.split("-");
		System.out.println(Arrays.toString(arr));
		
		//subString
		String str2 = "秋天工作室";
		System.out.println(str2.substring(2));
		System.out.println(str2.substring(0, 2)); //包头不包尾
		
		//trim
		String str3 = "      abc de        ";
		System.out.println(str3.trim());
	}
}
