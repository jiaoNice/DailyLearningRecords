package com.Jiao.demo02_InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader:�ַ���
 * 		extends Reader
 * 		������һ�ζ�ȡһ���ַ���һ�ζ�ȡһ���ַ�����
 * InputStreamReader ���ֽ���ͨ���ַ�������������������룩
 * ���죺
 * 		public InputStreamReader(InputStream in);//Ĭ�ϲ�GBK���
 * 		public InputStreamReader(InputStream in,String charsetName);//��ָ�����
 * 
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//1.����InputStreamReader����
		InputStreamReader isr = new InputStreamReader(new FileInputStream("1.txt"));
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("1.txt"),"UTF-8");
		//2.��ȡ����
		int ch = isr.read();
		System.out.println((char)ch);
		ch = isr.read();
		System.out.println((char)ch);
		//3.�ر���
		isr.close();
	}
}
