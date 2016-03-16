package com.autumnstudio.stringbuffer;

/*
 * StringBuffer��һ���洢�ַ����������߱�������Ϊ��
 * ���� -- append
 *     -- insert
 * ɾ�� -- delete
 * �޸� -- ensureCapacity ��չ���� -- һ�㲻������
 *     -- replace �滻
 *     -- reverse ��ת
 *     -- setCharAt
 *     -- subString
 * �鿴 -- indexOf
 *     -- charAt
 *     -- toString
 *     -- capacity
 *  StringBuilder JDK 1.5��ʼ����
 */
public class Demo2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		//append
		sb.append("abc");
		sb.append(true);
		sb.append(3.14f);
		System.out.println(sb);
		
		//insert
		sb.insert(2, "�й�");
		System.out.println(sb);
		
		//delete
		sb.delete(5, 9); //��ͷ����β
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		//replace
		sb.replace(2, 4, "�л����񹲺͹�"); //��ͷ����β
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		
		//subString
		System.out.println(sb.substring(2, 9));
		
		//indexOf
		sb.append("abcjavaabc");
		System.out.println(sb.indexOf("abc"));
		
		//capacity
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		//charAt
		System.out.println(sb.charAt(2));
		
		//toString
		String str = sb.toString();
		System.out.println(str);
		
		System.out.println(sb);
	}
}
