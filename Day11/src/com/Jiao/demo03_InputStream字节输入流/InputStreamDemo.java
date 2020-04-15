package com.Jiao.demo03_InputStream�ֽ�������;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream���ֽ��������ĸ��࣬����һ��������
 * read
 * 1.public int read();//��ȡһ���ֽڣ����ص���ACSII��ֵ
 * 2.public int read(byte[] bs);//��ȡһ���ֽ����飬����ֵ��ʾʵ�ʶ�ȡ�����ֽ���
 * ������InputStream�ľ������ࣺFileInputStream
 * public void close();//�ر���
 * public void 
 */
public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 1.�����ļ��ֽ�����������
		 * 2.����ļ��Ƿ���ڣ����������ֱ���׳��쳣
		 * 3.���� ����fis����������ָ����ļ�
		 */
		FileInputStream fis = new FileInputStream("1.txt");
		//2.��ȡ����
		readBs(fis);
		//3.�ر���
		fis.close();
	}
	public static void readBs(FileInputStream fis) throws IOException {
		//2.2��ȡһ���ֽ�����
		final int le = 10;
		byte[] bs = new byte[le];
		int len = 0;
		//String����һ������ public String(byte[]);
		//String�໹��һ������ public String(byte[],int startIndex,int len);
		while((len=fis.read(bs))!= -1) {
			System.out.print(new String(bs,0,len));
		}
		System.out.println();
	}
	public static void readOB(FileInputStream fis) throws IOException {
		//2.1��ȡһ���ֽ�
		/*int b = fis.read();
		System.out.println((char)b);
		b = fis.read();
		System.out.println((char)b);
		b = fis.read();
		System.out.println((char)b);*/
		//��׼����
		int b = 0;//��������ÿ�ζ�ȡ������ֵ
		/*
		 * 1.fis.read()  �ȶ�
		 * 2.b = fis.read()  ��ֵ
		 * 2.b!=-1  �ж�
		 */
		while((b=fis.read()) != -1) {
			System.out.println((char)b);
		}
	}

}
