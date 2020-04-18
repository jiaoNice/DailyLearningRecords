package com.Jiao.demo04_序列化和反序列化流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 序列化流：写对象到文件
 * 		ObjectOutputStream
 * 反序列化流：从文件中读取对象
 * 		ObjectInputStream
 * 
 * ObjectOutputStream：对象的字节输出流，写对象
 * 
 * 构造：
 * 		public ObjectOutputStream(OutputStream out);
 * 方法：
 * 		public void writeObject(Object obj);//这个方法会抛出异常NotSerializableException
 * ObjectInputStream：对象的字节输入流，读对象
 * 
 * 构造：
 * 		public ObjectInputStream(InputStream in);
 * 方法：
 * 		public Object readObject();//读对象
 * 
 * 
 */
public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		writeDog();
		readDog();
	}
	public static void readDog() throws IOException, ClassNotFoundException {
		//1.创建
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("2.txt"));
		//2.读对象
//		Dog d = (Dog)ois.readObject();
		Object obj = ois.readObject();
		System.out.println(obj);
		//3.关闭流
		ois.close();
	}
	public static void writeDog() throws IOException {
		//1.创建ObjectOutputStream对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("2.txt"));
		//2.写对象
		Dog d = new Dog(6,"小猪猪");
		oos.writeObject(d);
		//3.关闭流
		oos.close();
	}
}
