package com.Jiao.Demo04_��ǿforѭ��;

import java.security.AlgorithmParameterGeneratorSpi;
import java.util.ArrayList;
import java.util.Collection;

/*
 * ��ǿforѭ������ͨ��forѭ����ǿ���ģ�
 * 	��ǿ���﷨�ϸ��Ӽ�
 * ��ʽ��
 * 	for(��������  ������:����/����){
 * 		syso(������);
 * 	}
 * 
 * ע�⣺
 * 	����ʹ����ǿforѭ���������ϵ�ʱ��
 * 	�ײ���õ��ǵ�����
 * �ܽ᣺����ʹ����ǿforѭ����������ʱ�������޸ļ��ϵĳ���
 * 
 */
public class ForeachDemo {
	public static void main(String[] args) {
		String[] names = {"tom","lisa","vivi"};
		for(String name:names) {
			System.out.println(name);
		}
		Collection<Integer> ages = new ArrayList<Integer>();
		ages.add(12);
		ages.add(15);
		ages.add(13);
		for(Integer age:ages) {
			System.out.println(age);
//			ages.add(11);
		}
	}
}
