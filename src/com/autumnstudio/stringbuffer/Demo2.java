package com.autumnstudio.stringbuffer;

/*
 * StringBuffer是一个存储字符的容器，具备以下行为：
 * 增加 -- append
 *     -- insert
 * 删除 -- delete
 * 修改 -- ensureCapacity 扩展容量 -- 一般不会用它
 *     -- replace 替换
 *     -- reverse 反转
 *     -- setCharAt
 *     -- subString
 * 查看 -- indexOf
 *     -- charAt
 *     -- toString
 *     -- capacity
 *  StringBuilder JDK 1.5开始出现
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
		sb.insert(2, "中国");
		System.out.println(sb);
		
		//delete
		sb.delete(5, 9); //包头不包尾
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		//replace
		sb.replace(2, 4, "中华人民共和国"); //包头不包尾
		
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