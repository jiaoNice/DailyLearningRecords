package com.Jiao.demo02_InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader:字符流
 * 		extends Reader
 * 		方法：一次读取一个字符，一次读取一个字符数组
 * InputStreamReader 是字节流通向字符流的桥梁，查码表（解码）
 * 构造：
 * 		public InputStreamReader(InputStream in);//默认查GBK码表
 * 		public InputStreamReader(InputStream in,String charsetName);//查指定码表
 * 
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//1.创建InputStreamReader对象
		InputStreamReader isr = new InputStreamReader(new FileInputStream("1.txt"));
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("1.txt"),"UTF-8");
		//2.读取数据
		int ch = isr.read();
		System.out.println((char)ch);
		ch = isr.read();
		System.out.println((char)ch);
		//3.关闭流
		isr.close();
	}
}
