package com.Jiao.Demo06_������E�ĺ���;

import java.util.ArrayList;

/*
 * ������E�ĺ��壺
 * 	��һ��������������������һ����������
 * ���Ϳ����������ϡ������ϡ��ӿ���
 * 1.�����������ϣ�������
 * 	��ʽ��public class ����<E>
 * 	�������ϵķ���E����ʲôʱ�����ȷ����
 * 		���㴴������Ķ����ʱ�򣬾Ϳ���ȷ��
 * 2.�������ڷ����ϣ����ͷ���
 * 	��ʽ��public <T> ����ֵ���� ������(T t){}
 * 	���ͷ����ϵ�Tʲôʱ����ȷ����
 * 	������÷��������ݲ�����ʱ��ȷ��
 * 3.�������ڽӿ��ϣ����ͽӿ�
 * 	��ʽ��public interface class ����<E>
 * 	���ͽӿ��ϵķ��� ����ʲôʱ��ȷ����
 * 	1.ʵ����ʵ�ֽӿڵ�ʱ��ֱ��ȷ��
 * 	2.ʵ����ʵ�ֽӿڵ�ʱ�򣬲�ȷ�����ͣ�����ֱ�Ӱѷ��ͼ̳�����
 * 		�����ʵ���ഴ�������ʱ��ȷ��
 * 		
 * 
 * 
 * 
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		//1.����һ��Person
		Person person = new Person();
		person.setAge(111);
		//2.����һ��Person<E>
		Person<Integer> p = new Person<Integer>();
		p.setAge(13);
		Integer age = p.getAge();
		//3.ʹ�÷��ͷ���
		p.show(p);
		p.show("���ͷ���");
	}
}
