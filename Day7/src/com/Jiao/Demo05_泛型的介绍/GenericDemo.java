package com.Jiao.Demo05_泛型的介绍;

import java.util.ArrayList;

/*
 * 泛型：
 * 	泛泛的类型，不确定的类型
 * 格式：
 * 	<E>,<K,V>
 * 使用泛型的好处：
 * 	将运行时期的ClassCaseException，转移到了编译时期变成了编译失败
 * 	避免了类型强转的麻烦
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		demo02();
		
	}
	//不使用泛型
	public static void demo01() {
		//1.创建一个集合ArrayList
		ArrayList names = new ArrayList();
		names.add(123);
		names.add(true);
		names.add("aa");
		names.add(new String());
		//2.foreach
		for(Object obj:names) {
			System.out.println(obj);
			String dString = (String)obj;
			dString.length();
		}
	}
	
	//使用泛型
	public static void demo02() {
		//1.创建一个集合ArrayList
		ArrayList<String> names = new ArrayList<String>();
		names.add("tom");
		names.add("de");
		//2.遍历
		for(String name:names) {
			System.out.println(name);
		}
	}
}
