package com.Jiao.Demo07_泛型通配符;

import java.util.ArrayList;

/*
 * 通配符：
 * 	正则表达式中"."代表任意字符
 * 	在DOS中"*"代表任意字符
 * 泛型通配符：
 * 	?:代表任意类型
 * 	<? extends Animal>:表示一种泛型，这种泛型必须是Animal或者Animal的子类
 * 	<? super Animal>:表示一种泛型，这种泛型必须是Animal 或者Animal的父类
 * 在ArrayList中 有一个方法
 *  	addAll（Collection c);
 * 		//把集合C里面的每一个元素添加到ArrayList中
 */
public class GenericDemo {
	public static void main(String[] args) {
		//1.第一个集合
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("tom");
		names1.add("jeny");
		names1.add("vive");
		
		//第二个集合
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("sss");
		names2.add("ddd");
		names2.add("vdc");
		
		//3.需求：把names2中的元素都添加到names1中
		//Collection<? extends String> c
		names1.addAll(names2);
		System.out.println(names1);
		
		
	}
}
