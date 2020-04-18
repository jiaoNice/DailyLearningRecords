package com.Jiao.demo04_序列化和反序列化流;

import java.io.Serializable;

public class Dog implements  Serializable{
	//设置版本号，不会出现无效类异常
	private static final long serialVersionUID = 1L;
//	private static final long serialVersionUID = -5124447473225747226L;
	int age;
	String nickname;
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.nickname = name;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + nickname + "]";
	}
}
