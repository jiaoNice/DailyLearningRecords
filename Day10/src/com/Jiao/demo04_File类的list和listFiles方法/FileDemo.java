package com.Jiao.demo04_File���list��listFiles����;

import java.io.File;

/*
 * File���list��listFiles����
 * 1.public String[] list();//
 * 2.public File[] listFiles();
 * 	ע�⣺
 * 		ֻ���г���ǰ�ļ����µ�һ�����ļ��������ļ���
 * ��չ��
 * 	public boolean delete();//ɾ���ļ�����ļ���
 * 	
 * ��������ļ���
 * 		ɾ���ļ����������ļ��Լ����ļ������ļ��е������ļ�
 * �������ݹ�
 */
public class FileDemo {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\java�����ļ���");
		clear(f1);
		if(!f1.exists())
			System.out.println("ɾ���ɹ�");
	}
	//����ļ���
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
		//1.list����
		File f = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�");
		String[] ss = f.list();
		for(String n:ss) {
			System.out.println(n);
		}
		//2.listFiles����(����)
		File[] fs = f.listFiles();
		for(File f1:fs) {
			System.out.println(f1.getName());
		}
	}
}
