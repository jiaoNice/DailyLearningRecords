package com.Jiao.Demo03_��ϣֵ�ṹ;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * ��ϣ��ṹ��
 * 	����ṹ+����ṹ����ϣ���ѯ�죬��ɾ��
 * HashSet�������˹�ϣ��ṹ
 * LinkedHashSet������������+��ϣ��ṹ
 * Set�������������ص㣺
 * 	1.���±� 2.����LinkedHashSet��TreeSet���⣩ 3.�����ظ�
 * ��ϣ��ṹ���ж�Ԫ���Ƿ��ظ���ԭ��
 * 	1.���ж���Ԫ�صĹ�ϣֵ�����о�Ԫ�صĹ�ϣֵ�Ƿ���ͬ
 * 		���������ͬ��ֱ���жϲ��ظ������
 * 	2.�����ϣֵ��ͬ���ٵ��� ��Ԫ�� �͹�ϣֵ��ͬ�ľ�Ԫ�ص�equals����
 * 		�������ֵ��true���ж��ظ�Ԫ�أ������
 * 		�������ֵ��false���ж����ظ�,���
 * �ܽ᣺
 * 	ֻ�й�ϣֵ��ͬ������equals����false�����ж��ظ�
 */
public class HashCodeDemo {
	public static void main(String[] args) {
		//����
//		HashSet<String> s = new HashSet<String>();
//		s.add("java");
//		s.add("abc");
//		s.add("ccc");
//		s.add("acD");
//		s.add("�ص�");
//		s.add("abc");
//		s.add("ͨ��");
//		System.out.println(s);
		
		//����
		HashSet<String> s = new LinkedHashSet<String>();
		s.add("java");
		s.add("abc");
		s.add("ccc");
		s.add("acD");
		s.add("�ص�");
		s.add("abc");
		s.add("ͨ��");
		System.out.println(s);
	}
}
