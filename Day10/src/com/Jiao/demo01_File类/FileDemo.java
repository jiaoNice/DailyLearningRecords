package com.Jiao.demo01_File类;

import java.io.File;

/*
 * File类：
 * 	描述：文件和目录路径名的抽象表示
 * 文件：可以直接保存数据
 * 目录路径名：文件夹，分类管理文件
 * 结论：File类可以表示文件，也可以表示文件夹
 * 构造：
 * 	public File(String filepath)
 * 		绝对路径：以盘符开头的路径
 * 		相对路径：相对当前项目的根目录
 * public File(String parent,String path);
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//1.使用File(String filepath)构造创建File对象
		File f1 = new File("D:\\BaiduNetdiskDownload\\java\\JAVA进阶\\all\\第10天（IO【File、递归】）v20170314.doc");
		File f2 = new File("D:\\BaiduNetdiskDownload");
		//2.使用File(Stirng parent,String path)构造创建File对象
		File f3 = new File("D:\\BaiduNetdiskDownload\\java\\JAVA进阶\\all"+"第10天（IO【File、递归】）v20170314.doc");
		File f4 = new File("D:\\BaiduNetdiskDownload\\java"+"JAVA进阶\\all\\第10天（IO【File、递归】）v20170314.doc");
		//3.使用File(Stirng parent,String path)构造创建File对象
		File parent = new File("D:\\BaiduNetdiskDownload");
		File f5 = new File(parent,"java\\JAVA进阶\\all\\第10天（IO【File、递归】）v20170314.doc");
		
		
		System.out.println(f1);
		System.out.println(f5);
		
	}
}
