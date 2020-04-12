package com.Jiao.demo04_���ϱ�����ϰ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 1.ʹ��Map�洢����Ϊѧ�ţ�ֵΪһ��ѧ���Ķ���ѧ�����������ԣ����������䣩
 * 2.ʹ��Map�洢����Ϊѧ�������������䣩��ֵΪѧ����ͥסַ
 * ���ۣ�
 * 	���Map�еļ����Զ������ͣ���ôҪ��֤����Ψһ�ԣ�������д����Ӧ���hashCode��equals����
 * 
 * 
 */
public class MapTestDemo {
	public static void main(String[] args) {
		test02();
	}
	public static void test02() {
		Map<Student, String> students = new HashMap<Student,String>();
		students.put(new Student(15,"tom"), "����");
		students.put(new Student(16,"jeny"), "shanghai");
		students.put(new Student(17,"pony"),"beijing");
		students.put(new Student(19,"jeeeny"),"shh");
		//����
		/*//1.KeySet����
		Set<Student> set = students.keySet();
		//foreach
		for(Student s:set) {
			System.out.println("��ַ��"+students.get(s)+";������"+s.name+"�����䣺"+s.age);
		}
		//������
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("������"+s.name+";���䣺"+s.age+";��ַ��"+students.get(s));
		}*/
		//2.Iterator
		Set<Map.Entry<Student,String>> set = students.entrySet();
		Iterator<Map.Entry<Student,String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Student,String> en = it.next();
			Student s = en.getKey();
			System.out.println("������"+s.name+"�����䣺"+s.age+"����ַ��"+en.getValue());
		}
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
			Student student = sMap.get(id);
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
			Map.Entry<Integer,Student> entry = iterator.next();
			Student student = entry.getValue();
			System.out.println(entry.getKey()+":"+student.age+"�꣬����"+student.name);
		}
	}
}
