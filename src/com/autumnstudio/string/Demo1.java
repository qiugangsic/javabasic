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
		//"=="���ڱȽ������������͵�ʱ���ǱȽ�����������ڴ��ַ��equals����Ĭ��Ҳ�ǱȽ���������ĵ�ַ��
		//������Ҫ��д�����equals���������Ƚ��������͵��������͵Ķ���
		
		test("�й�");
		test("����");
	}
	
	public static void test(String str) {
		if ("�й�".equals(str)) {
			System.out.println("��ȷ");
		}else{
			System.out.println("�ش����");
		}
	}
}
