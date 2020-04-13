package com.Jiao.demo04_File类的list和listFiles方法;

import java.io.File;

/*
 * File类的list和listFiles方法
 * 1.public String[] list();//
 * 2.public File[] listFiles();
 * 	注意：
 * 		只能列出当前文件夹下的一级子文件或者子文件夹
 * 扩展：
 * 	public boolean delete();//删除文件或空文件夹
 * 	
 * 需求：清空文件夹
 * 		删除文件夹内所有文件以及该文件夹内文件夹的所有文件
 * 方法：递归
 */
public class FileDemo {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\于歉\\Desktop\\java笔记\\java测试文件夹");
		clear(f1);
		if(!f1.exists())
			System.out.println("删除成功");
	}
	//清空文件夹
	public static void clear(File f) {
		if(f.exists()) {
			File[] f1 = f.listFiles();
			for(File ff:f1) {
				if(ff.isFile()) {
					ff.delete();
				}else if(ff.isDirectory()) {
					clear(ff);
				}
			}
			f.delete();
		}
	}

	public static void test() {
		//1.list方法
		File f = new File("C:\\Users\\于歉\\Desktop\\java笔记");
		String[] ss = f.list();
		for(String n:ss) {
			System.out.println(n);
		}
		//2.listFiles方法(常用)
		File[] fs = f.listFiles();
		for(File f1:fs) {
			System.out.println(f1.getName());
		}
	}
}
