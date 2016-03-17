package com.autumnstudio.string;

public class Demo6 {
	public static void main(String[] args) {
		String s = "      ab   d  e   ";
		System.out.println(myTrim(s));
		
		String path = "E:\\workspace\\basicday12\\src\\com\\autumnstudio\\string\\Demo1.java";
		System.out.println(getFileName(path));
		
		String str = "abcd";
		System.out.println(reverse(str));
		
		String str1 = "xxabcdafabcljkabcdefiweryqiaabc";
		System.out.println(countSubString(str1, "abc"));
		
	}
	
	public static String myTrim(String str) {
		char[] arr = str.toCharArray();
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		while (arr[startIndex] == ' ') startIndex++;
		while (arr[endIndex] == ' ') endIndex--;
		
		return str.substring(startIndex, endIndex + 1);
	}
	
	//获取路径中的文件名
	public static String getFileName(String path) {
		int beginIndex = path.lastIndexOf('\\');
		return path.substring(beginIndex + 1);
	}
	
	//反转字符串
	public static String reverse(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return new String(arr);
	}
	
	//字符串出现的次数
	public static int countSubString(String target, String sub) {
		int count = 0;
		int index = 0;
		while ((index = target.indexOf(sub, index)) != -1) {
			count++;
			index = index + sub.length();
		}
		return count;
	}
}