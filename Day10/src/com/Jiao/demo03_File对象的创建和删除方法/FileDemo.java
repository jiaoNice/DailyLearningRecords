package com.Jiao.demo03_File对象的创建和删除方法;

import java.io.File;
import java.io.IOException;

/*
 * File对象的创建和删除方法：
 * 1.创建方法
 * 	创建文件：文件名不区分大小写，若文件已存在则创建失败
 * 		public boolean createNewFile();//创建一个新的文件（只能是文件，不能是文件夹），返回是否创建成功
 * 	创建文件夹
 * 		public boolean mkdir();//创建一个文件夹
 * 2.判断方法：
 * 	判断是否是文件
 * 		public boolean isFile();//返回是否是文件
 * 	判断是否是文件夹
 * 		public boolean isDirectory();//返回是否是文件夹
 * 	判断文件或者文件夹是否存在
 * 		public boolean exists();//返回该File对象是否存在
 * 3.删除方法
 * 		public boolean delete();//删除File对象
 * 			可以删除的是单个文件，或者空文件夹
 */
public class FileDemo {

	public static void main(String[] args) throws IOException {
		del();
	}
	
	//delete方法
	//不经过回收站
	public static void del() {
		File f = new File("C:\\Users\\于歉\\Desktop\\java笔记\\java测试文件夹");
		if(f.delete()) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
	}
	
	//判断File对象是否存在
	public static void isEx() {
		File f1 = new File("C:\\Users");
		if(f1.exists()) {
			System.out.println("file存在");
		}else {
			System.out.println("file不存在");
		}
	}
	
	//判断文件或者文件夹
	public static void isFOD() {
		//1.
		File f1 = new File("C:\\Users\\于歉\\Desktop\\java笔记\\java测试文件夹1.txt");
		boolean iF = f1.isFile();
		boolean iD = f1.isDirectory();
		if(iF) {
			System.out.println("f1是文件");
		}else {
			System.out.println("f1不是文件");
		}
		if(iD) {
			System.out.println("f1是文件夹");
		}else {
			System.out.println("f1不是文件夹");
		}
	}
	
	//创建文件或文件夹
	public static void createFOD() {
		/*//1.创建一个File对象，这个File对象必须代表一个文件
		File f1 = new File("C:\\Users\\于歉\\Desktop\\java笔记\\1.txt");
		//调用方法创建这个文件（若已存在则创建失败）
		boolean b = f1.createNewFile();
		if(b) {
			System.out.println("创建成功！");
		}else {
			System.out.println("创建失败！");
		}*/
		
		//2.创建一个File对象，这个File对象必须代表一个文件夹
		File f2 = new File("C:\\Users\\于歉\\Desktop\\java笔记\\java测试文件夹");
		boolean b2 = f2.mkdir();
		if(b2) {
			System.out.println("创建成功！");
		}else {
			System.out.println("创建失败！");
		}
	}
}
