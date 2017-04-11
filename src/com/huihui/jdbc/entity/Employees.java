package com.huihui.jdbc.entity;

import com.huihui.jdbc.ObjectBuilder;

public class Employees {

	private int id;
	private int age;
	private String first;
	private String last;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public static final ObjectBuilder<Employees> builder = new ObjectBuilder<Employees>() {
	};
}
