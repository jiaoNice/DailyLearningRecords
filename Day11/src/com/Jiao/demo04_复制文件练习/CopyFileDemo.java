package com.Jiao.demo04_复制文件练习;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制文件练习：
 * 	1.源文件：读取用的，new FileInputStream("源文件");
 * 	2.目标文件：写入用的，new FileOutputStream("目标文件");
 * 	3.一边读取 源文件，一边写入到目标文件(建议用字节数组方式，速度快)
 * 	4.关闭流
 */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		copy("C:\\Users\\于歉\\Desktop\\java笔记\\night.jpg");
	}

	private static void copy(String oldFilePath) throws IOException {
		//1.新建
		FileInputStream fis = new FileInputStream(oldFilePath);
		//有问题，需完善
		String newPath = oldFilePath.replaceAll("\\.", "副本\\.");
		FileOutputStream fos = new FileOutputStream(newPath);
		/*//方法一
		//慢，不推荐
		long s = System.currentTimeMillis();
		int b = 0;
		while((b=fis.read()) != -1) {
			fos.write(b);
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);*/
		//方法二(推荐)
		long s = System.currentTimeMillis();
		int len = 0;
		final int le = 1024;
		byte[] bs = new byte[le];//用来保存读取到的字节数据
		while((len=fis.read(bs)) != -1) {
			fos.write(bs,0,len);//写入bs中的从0下标开始len个字节到文件中
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);
		//3.关闭流
		//原则上先开后关(好看)
		fos.close();
		fis.close();
		System.out.println("copy成功");
	}

}
