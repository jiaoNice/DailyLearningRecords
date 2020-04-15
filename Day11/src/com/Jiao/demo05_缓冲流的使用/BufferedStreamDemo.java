package com.Jiao.demo05_缓冲流的使用;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 回顾：
 * 	1.FileOutputStream：文件的字节输出流
 * 		public void write(int b);//写一个字节
 * 		public void write(byte[] bs);//写一个字节数组
 * 		public void write(byte[] bs,int startInde,int len);//写一个字节数组的一部分
 * 
 * 	2.FileInputStream：
 * 		public int read();//一次读取一个字节
 * 		public int read(byte[] bs);//一次读取一个字节数组，返回值表示实际读取到的字节个数
 * 
 * 缓冲流：相比较没有缓冲区的流，效率更高
 * 	BufferedOutputStream  缓冲输出流
 * 		构造方法摘要
 * 		public BufferedOutputStream(OutputStream out)
 * 	BufferedInputStream  缓冲输入流
 * 		构造方法摘要
 * 		public BufferedInputStream(InputStream in)
 * 		
 */
public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
		//读
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1.txt"));
		/*//1
		int b = 0;
		while((b=bis.read())!=-1) {
			System.out.print((char)b);
		}*/
		//2
		int len = 0;
		byte[] bs = new byte[2];
		while((len=bis.read(bs))!=-1) {
			//！有中文的时候会出问题，  找解决方法
			System.out.print(new String(bs,0,len));
		}

		bis.close();
		
		/*//写
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("1.txt"));
		bos.write(100);
		byte[] bs = {49,48,48,89,68,67,69};
		bos.write(bs);
		bos.write(bs,0,3);
		bos.close();*/
	}

}
