package com.Jiao.demo03_Map���ϵڶ��ֱ�����ʽ��ֵ�Ա���;

import com.Jiao.demo03_Map���ϵڶ��ֱ�����ʽ��ֵ�Ա���.OuterInterface.InnerInterface;

public interface OuterInterface {
	public abstract void showOut();
	//�ڲ��ӿ�
	interface InnerInterface{
		public abstract void showIn();
	}
}
//��������ʵ����
//1.ʵ���ⲿ�ӿ�
class c1 implements OuterInterface{
	public void showOut() {
		System.out.println("ʵ���ⲿ�ӿ�");
	}
}
//2.ʵ���ڲ��ӿ�
//�ⲿ�ӿ�.�ڲ��ӿ�
//��дҲ�У�
class c2 implements InnerInterface{
	public void showIn() {
		System.out.println("ʵ���ڲ��ӿ�");
	}
}
class c3 implements OuterInterface.InnerInterface{
	public void showIn() {
		System.out.println("ͨ��OuterInterface.InnerInterfaceʵ���ڲ��ӿ�");
	}
}