package com.Jiao.demo04_�����ļ���ϰ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ļ���ϰ��
 * 	1.Դ�ļ�����ȡ�õģ�new FileInputStream("Դ�ļ�");
 * 	2.Ŀ���ļ���д���õģ�new FileOutputStream("Ŀ���ļ�");
 * 	3.һ�߶�ȡ Դ�ļ���һ��д�뵽Ŀ���ļ�(�������ֽ����鷽ʽ���ٶȿ�)
 * 	4.�ر���
 */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		copy("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\night.jpg");
	}

	private static void copy(String oldFilePath) throws IOException {
		//1.�½�
		FileInputStream fis = new FileInputStream(oldFilePath);
		//�����⣬������
		String newPath = oldFilePath.replaceAll("\\.", "����\\.");
		FileOutputStream fos = new FileOutputStream(newPath);
		/*//����һ
		//�������Ƽ�
		long s = System.currentTimeMillis();
		int b = 0;
		while((b=fis.read()) != -1) {
			fos.write(b);
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);*/
		//������(�Ƽ�)
		long s = System.currentTimeMillis();
		int len = 0;
		final int le = 1024;
		byte[] bs = new byte[le];//���������ȡ�����ֽ�����
		while((len=fis.read(bs)) != -1) {
			fos.write(bs,0,len);//д��bs�еĴ�0�±꿪ʼlen���ֽڵ��ļ���
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);
		//3.�ر���
		//ԭ�����ȿ����(�ÿ�)
		fos.close();
		fis.close();
		System.out.println("copy�ɹ�");
	}

}
