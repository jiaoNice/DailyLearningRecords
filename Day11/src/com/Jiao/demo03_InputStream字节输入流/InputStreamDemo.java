package com.Jiao.demo03_InputStream字节输入流;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream：字节输入流的根类，这是一个抽象类
 * read
 * 1.public int read();//读取一个字节，返回的是ACSII码值
 * 2.public int read(byte[] bs);//读取一个字节数组，返回值表示实际读取到的字节数
 * 我们用InputStream的具体子类：FileInputStream
 * public void close();//关闭流
 * public void 
 */
public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 1.创建文件字节输入流对象
		 * 2.检测文件是否存在，如果不存在直接抛出异常
		 * 3.存在 则让fis输入流对象指向该文件
		 */
		FileInputStream fis = new FileInputStream("1.txt");
		//2.读取数据
		readBs(fis);
		//3.关闭流
		fis.close();
	}
	public static void readBs(FileInputStream fis) throws IOException {
		//2.2读取一个字节数组
		final int le = 10;
		byte[] bs = new byte[le];
		int len = 0;
		//String类有一个构造 public String(byte[]);
		//String类还有一个构造 public String(byte[],int startIndex,int len);
		while((len=fis.read(bs))!= -1) {
			System.out.print(new String(bs,0,len));
		}
		System.out.println();
	}
	public static void readOB(FileInputStream fis) throws IOException {
		//2.1读取一个字节
		/*int b = fis.read();
		System.out.println((char)b);
		b = fis.read();
		System.out.println((char)b);
		b = fis.read();
		System.out.println((char)b);*/
		//标准代码
		int b = 0;//用来保存每次读取到的码值
		/*
		 * 1.fis.read()  先读
		 * 2.b = fis.read()  赋值
		 * 2.b!=-1  判断
		 */
		while((b=fis.read()) != -1) {
			System.out.println((char)b);
		}
	}

}
