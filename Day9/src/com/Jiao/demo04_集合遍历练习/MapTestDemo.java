package com.Jiao.demo04_���ϱ�����ϰ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 1.ʹ��Map�洢����Ϊѧ�ţ�ֵΪһ��ѧ���Ķ���ѧ�����������ԣ����������䣩
 * 2.
 * 
 */
public class MapTestDemo {
	public static void main(String[] args) {
		
	}
	public static void test01() {
		//��һ��
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
		
		
		
		//�ڶ���
		//1.����һ��Map����
		Map<Integer,Student> students = new HashMap<Integer,Student>();
		//2.�������
		students.put(151145, new Student(15,"����"));
		students.put(121321, new Student(21,"����"));
		students.put(123234, new Student(18,"½��"));
		//3.����һ����Map�������м�ֵ�Թ�ϵ����ļ���
		Set<Map.Entry<Integer, Student>> set = students.entrySet();
		//4.ʹ�õ���������
		Iterator<Map.Entry<Integer, Student>> iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry = iterator.next();
			Student student = (Student)entry.getValue();
			System.out.println(entry.getKey()+":"+student.age+"�꣬����"+student.name);
		}
	}
}
