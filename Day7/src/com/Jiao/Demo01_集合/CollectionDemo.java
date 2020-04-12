package com.Jiao.Demo01_����;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection���ӿ��ж���ķ�������Щ���������еļ����඼����
 * ������ӷ���
 * 	boolean add(E e);//���һ��Ԫ�أ�����ֵ��ʾ�Ƿ���ӳɹ�
 * ɾ��ɾ������
 * 	boolean remove(Object obj);//ɾ��ĳһ��Ԫ�أ�����ֵ��ʾ�Ƿ�ɾ���ɹ�
 * �ģ��޸�Ԫ��
 * 	��
 * �飺��ȡĳ��Ԫ��
 * 	��
 * ������
 * 	int size();//��ȡ����
 * 	void clear();//ɾ������Ԫ��
 * 	boolean contains(Object obj);//�ж��Ƿ����objԪ��
 * 	Object[] toArray();//����ת��������
 * 
 * 
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//1.����һ�����϶���,ʹ�ö�̬
		Collection<String> names = new ArrayList<String>();
		//2.���
		names.add("���౦��");
		names.add("�ɴ���");
		names.add("Tom");
		names.add("����");
		//3.��ӡ
		System.out.println(names);
		//4.ɾ��
		boolean b = names.remove("Tom");
		System.out.println(b);
		System.out.println(names);
		//5.��ȡ����
		System.out.println(names.size());
		//6.���
//		names.clear();//��names = null��ͬ
		System.out.println(names);
		System.out.println(names.size());
		//7.�ж��Ƿ����
		//���ܽϵ�
		System.out.println(names.contains("Tom"));
		//8.ת������   �õĽ���
		Object[] objects = names.toArray();
		for(int i = 0;i<objects.length;i++) {
			System.out.println(objects[i]);
		}
	}
}
