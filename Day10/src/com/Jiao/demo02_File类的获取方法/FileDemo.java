package com.Jiao.demo02_File��Ļ�ȡ����;

import java.io.File;

/*
 * File����Ļ�ȡ������
 * 1.public String getAbsolutePath();//��ȡ����·��
 * 2.public String getName();//��ȡ��ǰFile���������
 * 3.public String getPath();//��ȡ����File����ʱ ���ݵ�·��
 * 4.public long length();//��ȡ��ʾ�ļ���File�����ռ�õ��ֽ�����������ļ��е�File�����򷵻�ֵ��ȷ��
 */
public class FileDemo {
	public static void main(String[] args) {
		/*//1.��ȡ����·��
//		File f1 = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\1.docx");
		File f1 = new File("1.txt");
		String path = f1.getAbsolutePath();
		System.out.println(path);*/
		
		/*//2.��ȡ��ǰFile���������
		File f1 = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\1.docx");
		String name = f1.getName();
		File f2 = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�");
		String name2 = f2.getName();
		System.out.println(name);
		System.out.println(name2);*/
		
		/*//3.ʹ��getPath()��ȡ·��
		File f1 = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\1.docx");
		File f2 = new File("1.txt");
		String p1 = f1.getPath();
		String p2 = f2.getPath();
		System.out.println(p1);
		System.out.println(p2);*/
		
		//4.��ȡFile������ֽ���
		File f1 = new File("1.txt");
		long b = f1.length();
		System.out.println(b);//һ�����������ֽ�;һ����ĸ������һ���ֽ�;�س�ռ�����ֽ�
		File f2 = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�");
		long b2 = f2.length();
		System.out.println(b2);
	}
}
