package com.Jiao.demo06_复制单级文件夹;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirectoryDemo {

	public static void main(String[] args) throws IOException {
		//0.先定义源文件夹和目标文件夹
		File fileSrc = new File("C:\\Users\\于歉\\Desktop\\java笔记\\新建文件夹");
		File fileObj = new File("C:\\Users\\于歉\\Desktop\\java笔记\\我是copy的");
		//1.判断目标文件夹是否存在
		if(!fileObj.exists()) {
			boolean b = fileObj.mkdir();
			if(b)
				System.out.println("目标文件夹不存在，成功创建一个！");
		}else {
			System.out.println("目标文件夹已存在，不需要创建，直接复制即可！");
		}
		//2.列出源文件夹下所有的文件对象
		File[] files = fileSrc.listFiles();
		for(File f:files) {
			if(f.isFile()) {
				File nF = new File(fileObj,f.getName());
				copyFile(f,nF);
			}
				
		}
		System.out.println("copy成功");
	}
	public static void copyFile(File oldFile,File newFile) throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(oldFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		byte[] bs = new byte[1024];
		int len = 0;
		while((len=bis.read(bs))!=-1) {
			bos.write(bs,0,len);
		}
		bos.close();
		bis.close();
		System.out.println("复制"+newFile.getName()+"成功");
	}

}
