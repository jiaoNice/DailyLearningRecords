package com.Jiao.demo05_Properties属性集;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
 * 在开发中Map集合可能用到，但是Properties属性集，10000%会用到
 * 1.Properties类到底是什么？
 * 	属性集
 * 	class Properties extends HashTable implements Map
 * 	所以：Properties本质上 就是一个Map集合
 * 2.Properties是一个持久的属性集
 * 	所谓持久就是它具有自己写数据到文件的方法
 * 3.Properties是没有泛型，泛型是固定，String和String
 * 4.Properties类，具有Map接口的一切方法
 * 	还有一些自己特有的方法
 * 	String getProperty(String key);用指定的键在此属性列表中搜索属性的值，功能和Map的get一样
 * 	Object setProperty(String key,String value);添加键值对，功能和Map的put方法一样
 * 	Set<String> stringPropertyNames();和Map的keySet方法一样
 * 5.Properties具有持久化到文件的功能
 * 	store();//保存数据到文件，实际上不是保存到文件，而是写入到流中，由流写到文件
 * 	load();//从文件中加载数据，实际上不是直接加载文件，而是加载流中的数据，而流的数据是从该文件中读取的
 */
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		//和properties持久化有关的方法
		Properties p = new Properties();
		//从文件中读取数据
		p.load(new FileReader("names.properties"));
		System.out.println(p);
	
	}
	//Properties持久化数据到文件中
	public static void demo02() throws IOException {
		//和Properties持久化有关的方法
		//1.定义Properties
		Properties p = new Properties();
		p.setProperty("15","tom");
		p.setProperty("17","marry");
		p.setProperty("19","daw");
		//2.把p的数据持久化到文件中
		p.store(new FileWriter("names.properties"),"tips");
	
	}
	public static void demo01() {
		//1.创建一个Properties
				Properties p = new Properties();
				//2.添加数据
				p.setProperty("12","tony");
				p.setProperty("21","vivi");
				p.setProperty("17","dey");
				//3.遍历
				//1.stringPropertyNames 与keySet 相同
				Set<String> s = p.stringPropertyNames();
				Iterator<String> it = s.iterator();
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key+"岁的"+p.getProperty(key));
				}
				//2.
	}
}
