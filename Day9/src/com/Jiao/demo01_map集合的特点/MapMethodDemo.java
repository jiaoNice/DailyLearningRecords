package com.Jiao.demo01_map���ϵ��ص�;

import java.util.HashMap;
import java.util.Map;

/*
 * Map<K,V>���ϳ��õķ�����
 * ����put(K key,V value);//�򼯺�����Ӽ�ֵ��
 * 		//����������Ѵ��ڸü�������������ֵ�ԣ����ҷ��ر����ǵļ�ֵ�Ե�ֵ���ɣ�
 * ɾ��remove(Object key);//���ݼ���map������ɾ����ֵ�ԣ�����ֵ��ʾ��ɾ���ļ�ֵ�Ե�ֵ
 * �ģ����ص���put����
 * �飺V get(K key);//���ݼ� ��map�������ҵ�Ψһ��Ӧ��ֵ
 * 
 */
public class MapMethodDemo {

	public static void main(String[] args) {
		//1.����һ��Map����
		Map<String, String> map = new HashMap<String,String>();
		//2.��Ӽ�ֵ��
		map.put("�˳�", "beijing");
		map.put("��ٳ", "beijing");
		map.put("��", "shanghai");
		map.put("�ż���", "hangzhou");
		map.put("�", "007");
		System.out.println(map);
		String str = map.put("�ż���", "shanghai");
		System.out.println(map);
		//3.��ѯ
		System.out.println(map.get("�"));
		//4.ɾ��
		map.remove("�");
		System.out.println(map);
	}

}
