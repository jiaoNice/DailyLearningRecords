package com.Jiao.demo06_�ļ�������;

import java.io.File;

/*
 * �ļ���������
 * 	FileFilter
 * ��list��listFiles������ʹ��
 * 
 */
public class FileFilterDemo {

	public static void main(String[] args) {
		//1.����һ��File����
		File f = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\�½��ļ���");
		//2.�г�file������file����
		MyFileFilter ff = new MyFileFilter();
		File[] files = f.listFiles(ff);
		for(File file:files) {
			System.out.println(file.getName());
		}
	}

}
