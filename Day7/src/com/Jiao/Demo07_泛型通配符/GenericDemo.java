package com.Jiao.Demo07_����ͨ���;

import java.util.ArrayList;

/*
 * ͨ�����
 * 	������ʽ��"."���������ַ�
 * 	��DOS��"*"���������ַ�
 * ����ͨ�����
 * 	?:������������
 * 	<? extends Animal>:��ʾһ�ַ��ͣ����ַ��ͱ�����Animal����Animal������
 * 	<? super Animal>:��ʾһ�ַ��ͣ����ַ��ͱ�����Animal ����Animal�ĸ���
 * ��ArrayList�� ��һ������
 *  	addAll��Collection c);
 * 		//�Ѽ���C�����ÿһ��Ԫ����ӵ�ArrayList��
 */
public class GenericDemo {
	public static void main(String[] args) {
		//1.��һ������
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("tom");
		names1.add("jeny");
		names1.add("vive");
		
		//�ڶ�������
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("sss");
		names2.add("ddd");
		names2.add("vdc");
		
		//3.���󣺰�names2�е�Ԫ�ض���ӵ�names1��
		//Collection<? extends String> c
		names1.addAll(names2);
		System.out.println(names1);
		
		
	}
}
