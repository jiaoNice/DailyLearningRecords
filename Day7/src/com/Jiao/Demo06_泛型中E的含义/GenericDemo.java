package com.Jiao.Demo06_泛型中E的含义;

import java.util.ArrayList;

/*
 * 泛型中E的含义：
 * 	是一个“变量”，用来接收一种数据类型
 * 泛型可以用在类上、方法上、接口上
 * 1.泛型用在类上：泛型类
 * 	格式：public class 类名<E>
 * 	泛型类上的泛型E到底什么时候可以确定？
 * 		当你创建该类的对象的时候，就可以确定
 * 2.泛型用在方法上：泛型方法
 * 	格式：public <T> 返回值类型 方法名(T t){}
 * 	泛型方法上的T什么时候能确定？
 * 	当你调用方法，传递参数的时候确定
 * 3.泛型用在接口上：泛型接口
 * 	格式：public interface class 类名<E>
 * 	泛型接口上的泛型 到底什么时候确定？
 * 	1.实现类实现接口的时候，直接确定
 * 	2.实现类实现接口的时候，不确定泛型，而是直接把泛型继承下来
 * 		当这个实现类创建对象的时候确定
 * 		
 * 
 * 
 * 
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		//1.创建一个Person
		Person person = new Person();
		person.setAge(111);
		//2.创建一个Person<E>
		Person<Integer> p = new Person<Integer>();
		p.setAge(13);
		Integer age = p.getAge();
		//3.使用泛型方法
		p.show(p);
		p.show("泛型方法");
	}
}
