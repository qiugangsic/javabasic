package com.autumnstudio.object;

public class Demo1 {
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj1 = null;
		System.out.println(obj);
		System.out.println(obj == null);
		System.out.println(obj1 == null);
		
		Demo1 demo = new Demo1();
		System.out.println(demo);
		
		System.out.println("hashcode : " + demo.hashCode());
		System.out.println("toString : " + demo.toString());
		
		Person p = new Person(110, "狗娃");
		Person p1 = new Person(120, "狗剩");
		Person p2 = new Person(120, "狗剩");
		System.out.println(p);
		System.out.println(p2);
		
		System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));
		
		//需求：现实生活中身份证相同就是同一个人
		//重写equals方法
		Person p3 = new Person(110, "狗娃"); //小名
		Person p4 = new Person(110, "陈大富"); //大名
		System.out.println("p3和p4是同一个人吗？" + p3.equals(p4));
		
		//java规范中，重写了equals方法后，都需要重写hashcode方法。
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
	}
}

class Person {
	private int id;
	private String name;
	
	public Person() {}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "编号:" + id + ", 姓名:" + name;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.id == p.id;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
}