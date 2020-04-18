package com.Jiao.demo04_���л��ͷ����л���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ���л�����д�����ļ�
 * 		ObjectOutputStream
 * �����л��������ļ��ж�ȡ����
 * 		ObjectInputStream
 * 
 * ObjectOutputStream��������ֽ��������д����
 * 
 * ���죺
 * 		public ObjectOutputStream(OutputStream out);
 * ������
 * 		public void writeObject(Object obj);//����������׳��쳣NotSerializableException
 * ObjectInputStream��������ֽ���������������
 * 
 * ���죺
 * 		public ObjectInputStream(InputStream in);
 * ������
 * 		public Object readObject();//������
 * 
 * 
 */
public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		writeDog();
		readDog();
	}
	public static void readDog() throws IOException, ClassNotFoundException {
		//1.����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("2.txt"));
		//2.������
//		Dog d = (Dog)ois.readObject();
		Object obj = ois.readObject();
		System.out.println(obj);
		//3.�ر���
		ois.close();
	}
	public static void writeDog() throws IOException {
		//1.����ObjectOutputStream����
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("2.txt"));
		//2.д����
		Dog d = new Dog(6,"С����");
		oos.writeObject(d);
		//3.�ر���
		oos.close();
	}
}
