package com.Jiao.demo01_OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter:他是一个字符流
 * 		extends Writer
 * 		方法：写一个字符，写一个字符数组（一部分），写一个字符串（一部分）
 * 		描述：OutputStreamWriter 是字符流通向字节流的桥梁，查码表（编码）
 * OutputStreamWriter的构造：
 * 	public OutputStreamWriter(OutputStream out);//默认GBK
 * 	public OutputStreamWriter(OutputStream out,String charsetName);//创建使用指定字符集的OutputStreamWriter对象
 * 方法：
 * 		void write(int c);//写入单个字符
 * 		void write(String str,int off,int len);//写入字符串的某一部分
 * 		void write(char[] cbuf,int off,int len);//写入字符数组的某一部分
 * 		String getEncoding();//返回该流使用的字符编码的名称
 * 
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException{
		//1.创建流
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("1.txt"));
		//2.
		osw.write(48);
		osw.write("我吃饭了");
		char[] cs = {48,49,50,51,52,65,89};
		osw.write(cs);
		osw.write("不吃了吧还是",0,3);
		System.out.println(osw.getEncoding());
		//3.关闭流
		osw.close();
	}

}
