package com.Jiao.demo02_Map���ϵ�һ�ֱ�����ʽ�Լ���ֵ;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵ�һ�ֱ����������Լ���ֵ
 * 1.�Ȼ�ȡMap���ϵļ��ļ��ϣ����������һ��Set����
 * 		Set<K> keys = map����.KeySet();
 * 2.����keys����
 * 		a.foreach  b.������
 * 3.�ڱ����Ĺ����У���Map���ϻ�ȡ����Ӧ��ֵ
 * 
 */
public class KeySetDemo {
	public static void main(String[] args) {
		//1.����һ������
		Map<Integer, String> names = new LinkedHashMap<Integer,String>();
		//2.��Ӽ�ֵ��
		names.put(15114421, "�˳�");
		names.put(14223134, "��ٳ");
		names.put(16452233, "����");
		//3.��ȡmap�ļ��ļ���
		Set<Integer> sId = names.keySet();
		//4.����keys���ϣ���ȡ��ÿһ��ֵ
		//4.1����������
		Iterator<Integer> it = sId.iterator();
		while(it.hasNext()) {
			//���ݼ� ��map���ϲ��Ҷ�Ӧֵ
			System.out.println(names.get(it.next()));
		}
		//4.2foreach
		for(int id : sId) {
			System.out.println(names.get(id));
		}
	}
}
