package com.Jiao.demo06_文件过滤器;

import java.io.File;

/*
 * 文件过滤器：
 * 	FileFilter
 * 在list和listFiles方法中使用
 * 
 */
public class FileFilterDemo {

	public static void main(String[] args) {
		//1.创建一个File对象
		File f = new File("C:\\Users\\于歉\\Desktop\\java笔记\\新建文件夹");
		//2.列出file下所有file对象
		MyFileFilter ff = new MyFileFilter();
		File[] files = f.listFiles(ff);
		for(File file:files) {
			System.out.println(file.getName());
		}
	}

}
