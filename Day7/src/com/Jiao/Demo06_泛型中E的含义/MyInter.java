package com.Jiao.Demo06_������E�ĺ���;

public interface MyInter<Q> {
	public abstract void show(Q q);
}
//1.������ʵ�ֽӿڵ�ʱ��ȷ���ӿ��ϵķ���
class Myclass1 implements MyInter<String>{
	public void show(String q) {
		
	}
}
//2.������ʵ�ֽӿڵ�ʱ�򣬻���ȷ�����ͣ��ѽӿڵķ��ͼ���ʵ������
//��ʵ���ഴ�������ʱ��ȷ��
class MyClass2<Q> implements MyInter<Q>{
	public void show(Q q) {
		
	}
}
