package com.Jiao.Demo04_HashSet�洢�Զ���Ԫ��;

import java.util.HashSet;

/*
 * ʹ��HashSet�洢�Զ���Ԫ�أ�Dog����
 * ���ۣ�
 * 	��������Զ������࣬Ҫʹ��HashSet�洢
 * 	��α�֤Ԫ�ص�Ψһ�ԣ�
 * 		������д�Զ����������������hashCode��equals
 * ����һ����׼���ࣺ
 * 	1.��װ��private+get/set��
 * 	2.���죨�޲�+ȫ�Σ�
 * 	3.toString�����ٴ�ӡ������Ϣ��
 * 	4.hashCode��equals����֤Ԫ��ʹ�ù�ϣ��ṹ�洢ʱ��Ψһ�ԣ�
 * 
 */
public class HashSetDemo {
	public static void main(String[] args) {
		YellowDog yd = new YellowDog();
		System.out.println(yd instanceof Dog);
		Dog dog = new Dog();
		System.out.println(dog.getClass()==yd.getClass());
		//1.��������
		HashSet<Dog> dogs = new HashSet<Dog>();
		dogs.add(new Dog(12,"����"));
		dogs.add(new Dog(15,"С����"));
		dogs.add(new Dog(18,"������"));
		dogs.add(new Dog(20,"������"));
		dogs.add(new Dog(20,"������"));
		//�ܲ�����ӵ�dogs���ϣ�ȡ���ڵ�ֵַ
		//�����������������������ֶ���ͬ��������Ϊ��ͬһ���������ǲ�����ӵ�������
		System.out.println(dogs);
		
		
	}
}
