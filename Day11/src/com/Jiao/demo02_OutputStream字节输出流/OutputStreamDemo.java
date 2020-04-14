package com.Jiao.demo02_OutputStream�ֽ������;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * OutputStream���ֽ�������ĸ��࣬����һ��������
 * public void close();//�ر���
 * public void flush();//ˢ����
 * ��д�����й�ϵ�ķ�����
 * public void write(int b);//дһ���ֽ�  (127)
 * public void write(byte[] bs);//дһ���ֽ�����
 * public void write(byte[] bs,int startIndex,int length);//дһ���ֽ������һ����
 * 
 * ����ʹ�õ���OutputStream�ľ�������:FileOutputStream
 */
public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//1.����������
		FileOutputStream fos = new FileOutputStream("1.txt");
		/*
		 * 1.������һ���ļ��ֽ������������
		 * 2.����ļ������ڣ����Զ�����һ��
		 * 3.��fos�� ָ����ļ�
		 */
		//2.д����
		//2.1дһ���ֽ�
		fos.write(106);
		fos.write(97);
		fos.write(118);
		fos.write(97);
		fos.write(48);
		fos.write(48);
		//2.2дһ���ֽ�����
		byte[] bs = {109,55,78,56};
		//��String������һ��������getBytes()
		bs = "�й��Ұ���".getBytes();
		fos.write(bs);
		//2.3дһ���ֽ������һ����
		byte[] bbs = "javaa".getBytes();
		fos.write(bbs,0,4);
		//3.�ر���Դ
		fos.close();
	}

}
