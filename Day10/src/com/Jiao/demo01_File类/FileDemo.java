package com.Jiao.demo01_File��;

import java.io.File;

/*
 * File�ࣺ
 * 	�������ļ���Ŀ¼·�����ĳ����ʾ
 * �ļ�������ֱ�ӱ�������
 * Ŀ¼·�������ļ��У���������ļ�
 * ���ۣ�File����Ա�ʾ�ļ���Ҳ���Ա�ʾ�ļ���
 * ���죺
 * 	public File(String filepath)
 * 		����·�������̷���ͷ��·��
 * 		���·������Ե�ǰ��Ŀ�ĸ�Ŀ¼
 * public File(String parent,String path);
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		//1.ʹ��File(String filepath)���촴��File����
		File f1 = new File("D:\\BaiduNetdiskDownload\\java\\JAVA����\\all\\��10�죨IO��File���ݹ顿��v20170314.doc");
		File f2 = new File("D:\\BaiduNetdiskDownload");
		//2.ʹ��File(Stirng parent,String path)���촴��File����
		File f3 = new File("D:\\BaiduNetdiskDownload\\java\\JAVA����\\all"+"��10�죨IO��File���ݹ顿��v20170314.doc");
		File f4 = new File("D:\\BaiduNetdiskDownload\\java"+"JAVA����\\all\\��10�죨IO��File���ݹ顿��v20170314.doc");
		//3.ʹ��File(Stirng parent,String path)���촴��File����
		File parent = new File("D:\\BaiduNetdiskDownload");
		File f5 = new File(parent,"java\\JAVA����\\all\\��10�죨IO��File���ݹ顿��v20170314.doc");
		
		
		System.out.println(f1);
		System.out.println(f5);
		
	}
}
