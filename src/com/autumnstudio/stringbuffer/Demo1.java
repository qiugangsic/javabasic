package com.autumnstudio.stringbuffer;

/*
 * StringBuffer是一个存储字符的容器，具备以下行为：
 * 增加 -- append
 *     -- insert
 * 删除 -- delete
 * 修改 -- ensureCapacity
 * 查看 --
 * 判断 --
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
