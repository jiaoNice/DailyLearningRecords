package com.Jiao.Demo03_�����޸��쳣;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ʹ��Iterator���������ǿforѭ����������
 * ������֡�itcast���ַ���
 * ��ô�򼯺������һ����ITCAST���ַ���
 * 
 * ������������һ���쳣��
 * 	Concurrent��������Modification���޸ģ�Exception
 * 	java�涨�����һ������ʹ�õ�������������ô�ڱ����Ĺ����� �������޸ļ��ϵĳ��ȣ����ӻ���ɾ����
 * 
 */
public class ConcurrentModificationExceptionDemo {
	public static void main(String[] args) {
		//1.����һ������
		Collection<String> itStrings = new ArrayList<String>();
		itStrings.add("netease");
		itStrings.add(null);
		itStrings.add("itcast");
		itStrings.add("baidu");
		Iterator<String> itnames = itStrings.iterator();
		for(int i = 0;i<itStrings.size();i++) {
			if (itnames.hasNext()) {
				String s = itnames.next();
				//ע��˴�����������ǰ�棬������������
				if("itcast".equals(s)) {
					itStrings.add("ITCAST");
				}
			}
		}
	}
}
