package com.Jiao.demo02_OutputStream字节输出流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * OutputStream：字节输出流的根类，这是一个抽象类
 * public void close();//关闭流
 * public void flush();//刷新流
 * 和写数据有关系的方法：
 * public void write(int b);//写一个字节  (127)
 * public void write(byte[] bs);//写一个字节数组
 * public void write(byte[] bs,int startIndex,int length);//写一个字节数组的一部分
 * 
 * 我们使用的是OutputStream的具体子类:FileOutputStream
 */
public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//1.创建流对象
		FileOutputStream fos = new FileOutputStream("1.txt");
		/*
		 * 1.创建了一个文件字节流输出流对象
		 * 2.如果文件不存在，会自动创建一个
		 * 3.让fos流 指向该文件
		 */
		//2.写数据
		//2.1写一个字节
		fos.write(106);
		fos.write(97);
		fos.write(118);
		fos.write(97);
		fos.write(48);
		fos.write(48);
		//2.2写一个字节数组
		byte[] bs = {109,55,78,56};
		//在String类中有一个方法，getBytes()
		bs = "中国我爱你".getBytes();
		fos.write(bs);
		//2.3写一个字节数组的一部分
		byte[] bbs = "javaa".getBytes();
		fos.write(bbs,0,4);
		//3.关闭资源
		fos.close();
	}

}
