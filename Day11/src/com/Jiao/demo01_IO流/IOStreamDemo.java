package com.Jiao.demo01_IO流;
/*
 * IO流：
 * 根据流的流向分类：
 * 	Input：输入流
 * 	Output：输出流
 * 根据流操作的数据来分类：
 * 	字符流：操作字符
 * 		只能操作普通文本文件
 * 		最常见的文本文件：.txt，.java，.c，.cpp等其他语言的源代码
 * 		只要用文本工具（记事本，notepad++，editplus）可以打开的，而且打开后我们人类能看懂的都是文本文件
 * 		注意：我们用的.doc,.excel,.ppt这些不是文本文件
 * 	字节流：操作字节
 * 		能操作一切文件（文本文件，.mp3，视频.avi，.mp4,.doc,.excel,.ppt）
 * java中的四大流：
 * 	*字符输入流：共同父类Reader  比如：FileReader，BufferedReader
 * 		功能：读取一个字符，读取一个字符数组
 * 	*字符输出流：共同的父类Writer  比如：FileWrite,BufferedWriter
 * 		功能：写一个字符，写一个字符数组（一部分），写一个字符串
 * 	*字节输入流：共同父类InputStream  比如：FileInputStream，BufferedInputStream
 * 		功能：读取一个字节，读取一个字节数组
 * 	*字节输出流：共同父类OutputStream（抽象类）  比如：FileOutputStream，BufferedOutputStream
 * 		功能：写一个字节，写一个字节数组（一部分）
 * 总结2条规律：
 * 		只要是输入流，此流的方法名一定叫read
 * 		只要是输出流，此流的方法名一定叫write
 * 
 * 		java中流的命名是十分规范的：
 * 			功能+父类的名字
 * 			
 * 
 */
public class IOStreamDemo {
	public static void main(String[] args) {
		System.out.println("123");
	}
}
