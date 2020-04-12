package com.Jiao.demo04_集合遍历练习;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 1.使用Map存储：键为学号，值为一个学生的对象，学生对象有属性（姓名，年龄）
 * 2.使用Map存储：键为学生（姓名，年龄），值为学生家庭住址
 * 结论：
 * 	如果Map中的键是自定义类型，那么要保证键的唯一性，必须重写键对应类的hashCode和equals方法
 * 
 * 
 */
public class MapTestDemo {
	public static void main(String[] args) {
		test02();
	}
	public static void test02() {
		Map<Student, String> students = new HashMap<Student,String>();
		students.put(new Student(15,"tom"), "北京");
		students.put(new Student(16,"jeny"), "shanghai");
		students.put(new Student(17,"pony"),"beijing");
		students.put(new Student(19,"jeeeny"),"shh");
		//遍历
		/*//1.KeySet遍历
		Set<Student> set = students.keySet();
		//foreach
		for(Student s:set) {
			System.out.println("地址："+students.get(s)+";姓名："+s.name+"；年龄："+s.age);
		}
		//迭代器
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("姓名："+s.name+";年龄："+s.age+";地址："+students.get(s));
		}*/
		//2.Iterator
		Set<Map.Entry<Student,String>> set = students.entrySet();
		Iterator<Map.Entry<Student,String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Student,String> en = it.next();
			Student s = en.getKey();
			System.out.println("姓名："+s.name+"；年龄："+s.age+"；地址："+en.getValue());
		}
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
			Student student = sMap.get(id);
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
			Map.Entry<Integer,Student> entry = iterator.next();
			Student student = entry.getValue();
			System.out.println(entry.getKey()+":"+student.age+"岁，姓名"+student.name);
		}
	}
}
