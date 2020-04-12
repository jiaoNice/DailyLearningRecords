package com.Jiao.Demo06_泛型中E的含义;

public class Person<E> {
	E age;

	public E getAge() {
		return age;
	}

	public void setAge(E age) {
		this.age = age;
	}
	public <T> void show(T t) {
		System.out.println(t);
	}
}
