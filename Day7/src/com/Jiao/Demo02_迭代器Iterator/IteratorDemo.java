package com.Jiao.Demo02_迭代器Iterator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合的遍历：
 * 	在根接口中  使用了一种公共的遍历方式，迭代器遍历
 * 1.获取一个集合的迭代器对象（迭代器对象不是我们创建的，而是每个集合自带）
 * 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		//1.创建一个集合对象，使用多态
		Collection<String> names = new ArrayList<String>();
		//2.添加
		names.add("海绵宝宝");
		names.add("派大星");
		names.add("冰雪女王");
		//3.获取names集合的迭代器对象
		Iterator<String> iterator = names.iterator();
		/*//4.标准代码
		while(iterator.hasNext()) {//反复判断有没有下一个元素
			String string = iterator.next();//如果有取出下一个元素
			System.out.println(string);
		}*/
		System.out.println(iterator.next());
		iterator.remove();
		System.out.println(iterator.next());
		System.out.println(names);
	}
}
