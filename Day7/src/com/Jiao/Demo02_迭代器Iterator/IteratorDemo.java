package com.Jiao.Demo02_������Iterator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���ϵı�����
 * 	�ڸ��ӿ���  ʹ����һ�ֹ����ı�����ʽ������������
 * 1.��ȡһ�����ϵĵ��������󣨵��������������Ǵ����ģ�����ÿ�������Դ���
 * 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		//1.����һ�����϶���ʹ�ö�̬
		Collection<String> names = new ArrayList<String>();
		//2.���
		names.add("���౦��");
		names.add("�ɴ���");
		names.add("��ѩŮ��");
		//3.��ȡnames���ϵĵ���������
		Iterator<String> iterator = names.iterator();
		/*//4.��׼����
		while(iterator.hasNext()) {//�����ж���û����һ��Ԫ��
			String string = iterator.next();//�����ȡ����һ��Ԫ��
			System.out.println(string);
		}*/
		System.out.println(iterator.next());
		iterator.remove();
		System.out.println(iterator.next());
		System.out.println(names);
	}
}
