package com.Jiao.demo04_���л��ͷ����л���;

import java.io.Serializable;

public class Dog implements  Serializable{
	//���ð汾�ţ����������Ч���쳣
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
