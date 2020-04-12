package com.Jiao.demo04_集合遍历练习;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 1.使用Map存储：键为学号，值为一个学生的对象，学生对象有属性（姓名，年龄）
 * 2.
 * 
 */
public class MapTestDemo {
	public static void main(String[] args) {
		
	}
	public static void test01() {
		//第一种
		Map<Integer, Student> sMap = new HashMap<Integer,Student>();
		sMap.put(453,new Student(12,"jony"));
		sMap.put(222,new Student(15,"marry"));
		sMap.put(33,new Student(16,"tom"));
		sMap.put(43,new Student(13,"tony"));
		System.out.println(sMap);
		
		Set<Integer> sets = sMap.keySet();
		for(Integer id:sets) {
			Student student = (Student)sMap.get(id);
			System.out.println(student.age+student.name);
		}
		
		
		
		//第二种
		//1.创建一个Map集合
		Map<Integer,Student> students = new HashMap<Integer,Student>();
		//2.添加数据
		students.put(151145, new Student(15,"李玲"));
		students.put(121321, new Student(21,"刘鹏"));
		students.put(123234, new Student(18,"陆明"));
		//3.创建一个有Map集合所有键值对关系对象的集合
		Set<Map.Entry<Integer, Student>> set = students.entrySet();
		//4.使用迭代器遍历
		Iterator<Map.Entry<Integer, Student>> iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry = iterator.next();
			Student student = (Student)entry.getValue();
			System.out.println(entry.getKey()+":"+student.age+"岁，姓名"+student.name);
		}
	}
}
