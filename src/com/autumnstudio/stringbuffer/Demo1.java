package com.autumnstudio.stringbuffer;

/*
 * StringBuffer��һ���洢�ַ����������߱�������Ϊ��
 * ���� -- append
 *     -- insert
 * ɾ�� -- delete
 * �޸� -- ensureCapacity
 * �鿴 --
 * �ж� --
 */
public class Demo1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("java");
		sb.append("java");
		sb.append("java");
		sb.append("java");
		sb.append("java");
		sb.append("java");
		sb.append("java");
		sb.appendCodePoint(65);
		System.out.println(sb);
	}
}
