package com.Jiao.demo06_�ɱ����;
/*
 * �ɱ������˵�Ĳ��ǲ������Ϳɱ䣬���ǲ����ĸ������Ա仯
 * �﷨��JDK1.5 ����������
 * 	public ����ֵ����  ����������������...  ��������{}
 * 	ע�⣺
 * 	1.�ɱ����ֻ�ǲ����ĸ���������������������Ͳ��ܸı�
 * 	2.һ�������У�ֻ����һ���ɱ����
 * 	3.��һ���������ж��������������һ���ǿɱ������ʱ��Ҫ������ɱ�������������
 * �ɱ�����ı��ʣ�����һ������
 */
public class VariableArgumentsDemo {

	public static void main(String[] args) {
		add(12,13);
		add(21,45,65);
	}
	public static void add(int... a) {
		int sum = 0;
		for(int n:a) {
			sum+=n;
		}
		System.out.println(sum);
	}
}
