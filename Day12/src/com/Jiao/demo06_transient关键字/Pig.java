package com.Jiao.demo06_transient¹Ø¼ü×Ö;

import java.io.Serializable;

public class Pig implements Serializable {
	String name;
	transient int age;
	@Override
	public String toString() {
		return "Pig [name=" + name + ", age=" + age + "]";
	}
	public Pig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pig(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
