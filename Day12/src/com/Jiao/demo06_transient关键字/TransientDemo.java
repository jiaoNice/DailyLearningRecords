package com.Jiao.demo06_transient�ؼ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * transient���ؼ��ֵ�����
 * 	�������γ�Ա�������ò���transient���γ�Ա������ȫû��Ӱ��
 * 	�������л���ʱ�����ã����һ����Ա������transient���Σ���ô���л���ʱ�����Ըó�Ա����
 * 
 */
public class TransientDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		writePig();
		readPig();
	}
	public static void writePig() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("2.txt"));
		Pig p = new Pig("����",3);
		oos.writeObject(p);
		oos.close();
	}
	public static void readPig() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("2.txt"));
		Object obj = ois.readObject();
		System.out.println(obj);
		ois.close();
	}
}
