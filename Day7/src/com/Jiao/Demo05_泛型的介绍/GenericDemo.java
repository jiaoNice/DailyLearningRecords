package com.Jiao.Demo05_���͵Ľ���;

import java.util.ArrayList;

/*
 * ���ͣ�
 * 	���������ͣ���ȷ��������
 * ��ʽ��
 * 	<E>,<K,V>
 * ʹ�÷��͵ĺô���
 * 	������ʱ�ڵ�ClassCaseException��ת�Ƶ��˱���ʱ�ڱ���˱���ʧ��
 * 	����������ǿת���鷳
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		demo02();
		
	}
	//��ʹ�÷���
	public static void demo01() {
		//1.����һ������ArrayList
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
	
	//ʹ�÷���
	public static void demo02() {
		//1.����һ������ArrayList
		ArrayList<String> names = new ArrayList<String>();
		names.add("tom");
		names.add("de");
		//2.����
		for(String name:names) {
			System.out.println(name);
		}
	}
}
