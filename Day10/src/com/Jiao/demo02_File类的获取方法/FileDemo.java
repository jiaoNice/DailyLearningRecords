package com.Jiao.demo02_File类的获取方法;

import java.io.File;

/*
 * File对象的获取方法：
 * 1.public String getAbsolutePath();//获取绝对路径
 * 2.public String getName();//获取当前File对象的名字
 * 3.public String getPath();//获取创建File对象时 传递的路径
 * 4.public long length();//获取表示文件的File对象的占用的字节数；如果是文件夹的File对象，则返回值不确定
 */
public class FileDemo {
	public static void main(String[] args) {
		/*//1.获取绝对路径
//		File f1 = new File("C:\\Users\\于歉\\Desktop\\java笔记\\1.docx");
		File f1 = new File("1.txt");
		String path = f1.getAbsolutePath();
		System.out.println(path);*/
		
		/*//2.获取当前File对象的名字
		File f1 = new File("C:\\Users\\于歉\\Desktop\\java笔记\\1.docx");
		String name = f1.getName();
		File f2 = new File("C:\\Users\\于歉\\Desktop\\java笔记");
		String name2 = f2.getName();
		System.out.println(name);
		System.out.println(name2);*/
		
		/*//3.使用getPath()获取路径
		File f1 = new File("C:\\Users\\于歉\\Desktop\\java笔记\\1.docx");
		File f2 = new File("1.txt");
		String p1 = f1.getPath();
		String p2 = f2.getPath();
		System.out.println(p1);
		System.out.println(p2);*/
		
		//4.获取File对象的字节数
		File f1 = new File("1.txt");
		long b = f1.length();
		System.out.println(b);//一个中文两个字节;一个字母或数字一个字节;回车占两个字节
		File f2 = new File("C:\\Users\\于歉\\Desktop\\java笔记");
		long b2 = f2.length();
		System.out.println(b2);
	}
}
