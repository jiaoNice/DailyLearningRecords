package com.Jiao.demo06_transient关键字;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * transient：关键字的作用
 * 	用来修饰成员变量，用不用transient修饰成员变量完全没有影响
 * 	但是序列化的时候有用，如果一个成员变量被transient修饰，那么序列化的时候会忽略该成员变量
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
		Pig p = new Pig("大猪",3);
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
