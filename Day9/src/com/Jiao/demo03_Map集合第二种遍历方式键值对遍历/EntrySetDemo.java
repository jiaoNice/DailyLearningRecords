package com.Jiao.demo03_Map���ϵڶ��ֱ�����ʽ��ֵ�Ա���;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * �ڲ��ࣺһ����A������������һ����B���ڲ��������A����Ϊ�ڲ���
 * �ڲ��ӿڣ�һ���ӿ�A������������һ���ӿ�B���ڲ�������ӿ�A����Ϊ�ڲ��ӿ�
 * Map���ϵڶ��ֱ�������ֵ�Ա���
 * 	1.��ȡMap���������м�ֵ�Թ�ϵ����ļ��� �����֤����
 * 		Set<Map.Entry<K,V>> set = Map����.entrySet();
 * 	2.�������Set���ϣ���ȡÿһ��Map.Entry���͵Ķ���
 * 		a.������b.foreach
 * 	3.��ȡ��Map.Entry���͵Ķ���֮��
 * 		K key = entry.getKey();
 * 		V value = entry.getValue();
 */
public class EntrySetDemo {
	public static void main(String[] args) {
		//1.����һ��Map����
		Map<Integer, String> student = new LinkedHashMap<Integer,String>();
		//2.��Ӽ�ֵ��
		student.put(1511112,"���");
		student.put(1946223,"�Ÿ�");
		student.put(1313123, "����֮");
		//3.��ȡ���м�ֵ�Թ�ϵ����ļ���
		//����Ȼ��Entry,����Map.Entry
		Set<Map.Entry<Integer,String>> es  = student.entrySet();
		//4.�������Entry���ϣ��ó�ÿһ������
		//ʹ�õ���������
		Iterator<Map.Entry<Integer, String>> it = es.iterator();
		Iterator<Entry<Integer, String>> iterator = es.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
		}
		
		/*//һ�����ʣ�ʵ���ڲ��ӿ�ʱ����Ҫ �ⲿ�ӿ�.�ڲ��ӿڣ����Է��ֲ�д�ⲿ�ӿ�.Ҳ��
		//�����ⲿ��
		OuterClass oc = new OuterClass();
		//�����ڲ���
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		OuterClass.InnerClass ii = oc.new InnerClass();
		c1 c1 = new c1();
		c1.showOut();
		c2 cc = new c2();
		cc.showIn();
		c3 ccC3 = new c3();
		ccC3.showIn();*/
	}
}
