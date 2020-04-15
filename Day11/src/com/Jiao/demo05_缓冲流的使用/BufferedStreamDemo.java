package com.Jiao.demo05_��������ʹ��;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * �عˣ�
 * 	1.FileOutputStream���ļ����ֽ������
 * 		public void write(int b);//дһ���ֽ�
 * 		public void write(byte[] bs);//дһ���ֽ�����
 * 		public void write(byte[] bs,int startInde,int len);//дһ���ֽ������һ����
 * 
 * 	2.FileInputStream��
 * 		public int read();//һ�ζ�ȡһ���ֽ�
 * 		public int read(byte[] bs);//һ�ζ�ȡһ���ֽ����飬����ֵ��ʾʵ�ʶ�ȡ�����ֽڸ���
 * 
 * ����������Ƚ�û�л�����������Ч�ʸ���
 * 	BufferedOutputStream  ���������
 * 		���췽��ժҪ
 * 		public BufferedOutputStream(OutputStream out)
 * 	BufferedInputStream  ����������
 * 		���췽��ժҪ
 * 		public BufferedInputStream(InputStream in)
 * 		
 */
public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
		//��
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1.txt"));
		/*//1
		int b = 0;
		while((b=bis.read())!=-1) {
			System.out.print((char)b);
		}*/
		//2
		int len = 0;
		byte[] bs = new byte[2];
		while((len=bis.read(bs))!=-1) {
			//�������ĵ�ʱ�������⣬  �ҽ������
			System.out.print(new String(bs,0,len));
		}

		bis.close();
		
		/*//д
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("1.txt"));
		bos.write(100);
		byte[] bs = {49,48,48,89,68,67,69};
		bos.write(bs);
		bos.write(bs,0,3);
		bos.close();*/
	}

}
