package com.Jiao.Demo01_���ݽṹ;

import java.util.LinkedList;

/*
 *  List�ӿڵ��ص㣺
 *  	a.���±�
 *  	b.����ģ���������Ȼ˳�򣬲���123��abc������ָ���Ǵ��ȡ��˳�� һ�£�
 *  	c.���ظ�
 *  	ʵ���ࣺArrayList��LinkedList��Vector
 *  	ArrayList:�ײ��������ṹ����ѯ�죬��ɾ��
 *  	LinkedList:�ײ��������ṹ����ѯ������ɾ��
 *  	Vector���ײ��������ṹ����ѯ�죬��ɾ��
 *  	List�ṹ�о��еķ�����
 *  	����add(E e);add(int index,E e);
 *  	ɾ��remove(Object obj);remove(int index);
 *  	�ģ�set(int index,E e);
 *  	�飺get(int index);
 *  	������size();clear();contains(Object obj);toArray();
 *  		iterator();isEmpty();
 *  	ʵ����ķ�����
 *  	1.ArrayList�����������Ϻ�List�ж���һģһ��
 *  	2.LinkedList�����˺�List�ӿ���һ���ķ���֮��
 *  		LinkedList�ṩ�˴�����β�����ķ���
 *  		��һ�飺
 *  		void addFirst(E e);
 *  		void addLast(E e);
 *  		�ڶ��飺
 *  		E removeFirst();//ɾ���׸�Ԫ�أ����ر�ɾ����Ԫ��
 *  		E removeLast();//
 *  		�����飺
 *  		E getFirst();
 *  		E getLast();
 *  		�����飺
 *  		E pop();//������ɾ�������е�ĳһ��Ԫ�أ���removeFirstЧ����ͬ
 *  		void push(E e);//���룬��һ��Ԫ����ӵ������У���addFirstЧ����ͬ
 *  
 */
public class ListDemo {

	public static void main(String[] args) {
		//1.����LinkedList���������з���
		LinkedList<String> c = new LinkedList<String>();
		//2.�������
		c.add("���»�");
		c.add("���¸�");
		c.addFirst("С����");
		c.addFirst("���Ϲ�");
		c.addLast("����");
		c.addLast("������");
		//3.ɾ������
		c.remove("����");//boolean
		String first = c.removeFirst();//String
		String last = c.removeLast();//String
		//4.��ѯ����
		String f = c.getFirst();
		String l = c.getLast();
		//5.��������
		String p = c.pop();
		c.push("����push");
//		System.out.println();
		System.out.println(c);
		
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("���»�");
		c1.add("���¸�");
		c1.addFirst("С����");
		c1.addFirst("���Ϲ�");
		c1.addLast("����");
		c1.addLast("������");
		c1.removeAll(c1);//ɾ��ĳcollection���ϵ�ȫ��
		c1.clear();
		System.out.println(c1);
		
	}

}
