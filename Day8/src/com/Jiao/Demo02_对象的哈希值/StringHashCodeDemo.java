package com.Jiao.Demo02_����Ĺ�ϣֵ;
/*
 * �ַ����Ĺ�ϣֵ��
 * 	����String����д��HashCode  ��ϣֵ����ͨ����ֵַ����
 * 	���ǹ۲�Դ�룬����ͨ���ַ��������ݼ��㣬��ôֻҪ�ַ���������ͬ����ϣֵ�ض���ͬ
 * ˼����
 * 	ֻҪ�ַ�������һ������ϣֵ�ض�һ��
 * 	�����ַ��������ݲ�һ��,��ϣֵ����һ����
 * 	���磺abc��acD,�ص� ��  ͨ��
 */
public class StringHashCodeDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1==s2);//�Ƚϵľ��������ĵ�ֵַ,false
		System.out.println(s1.hashCode()==s2.hashCode());//true,
		System.out.println(s1.equals(s2));//true,�Ƚ�����
		System.out.println(s1.hashCode());
		//��������ַ����Ĺ�ϣֵһ������ô���ݿ��ܲ�һ��
		System.out.println("�ص�".hashCode()=="ͨ��".hashCode());
		System.out.println("abc".hashCode()=="acD".hashCode());
	}
}
