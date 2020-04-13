package com.Jiao.demo03_File����Ĵ�����ɾ������;

import java.io.File;
import java.io.IOException;

/*
 * File����Ĵ�����ɾ��������
 * 1.��������
 * 	�����ļ����ļ��������ִ�Сд�����ļ��Ѵ����򴴽�ʧ��
 * 		public boolean createNewFile();//����һ���µ��ļ���ֻ�����ļ����������ļ��У��������Ƿ񴴽��ɹ�
 * 	�����ļ���
 * 		public boolean mkdir();//����һ���ļ���
 * 2.�жϷ�����
 * 	�ж��Ƿ����ļ�
 * 		public boolean isFile();//�����Ƿ����ļ�
 * 	�ж��Ƿ����ļ���
 * 		public boolean isDirectory();//�����Ƿ����ļ���
 * 	�ж��ļ������ļ����Ƿ����
 * 		public boolean exists();//���ظ�File�����Ƿ����
 * 3.ɾ������
 * 		public boolean delete();//ɾ��File����
 * 			����ɾ�����ǵ����ļ������߿��ļ���
 */
public class FileDemo {

	public static void main(String[] args) throws IOException {
		del();
	}
	
	//delete����
	//����������վ
	public static void del() {
		File f = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\java�����ļ���");
		if(f.delete()) {
			System.out.println("ɾ���ɹ�");
		}else {
			System.out.println("ɾ��ʧ��");
		}
	}
	
	//�ж�File�����Ƿ����
	public static void isEx() {
		File f1 = new File("C:\\Users");
		if(f1.exists()) {
			System.out.println("file����");
		}else {
			System.out.println("file������");
		}
	}
	
	//�ж��ļ������ļ���
	public static void isFOD() {
		//1.
		File f1 = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\java�����ļ���1.txt");
		boolean iF = f1.isFile();
		boolean iD = f1.isDirectory();
		if(iF) {
			System.out.println("f1���ļ�");
		}else {
			System.out.println("f1�����ļ�");
		}
		if(iD) {
			System.out.println("f1���ļ���");
		}else {
			System.out.println("f1�����ļ���");
		}
	}
	
	//�����ļ����ļ���
	public static void createFOD() {
		/*//1.����һ��File�������File����������һ���ļ�
		File f1 = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\1.txt");
		//���÷�����������ļ������Ѵ����򴴽�ʧ�ܣ�
		boolean b = f1.createNewFile();
		if(b) {
			System.out.println("�����ɹ���");
		}else {
			System.out.println("����ʧ�ܣ�");
		}*/
		
		//2.����һ��File�������File����������һ���ļ���
		File f2 = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\java�����ļ���");
		boolean b2 = f2.mkdir();
		if(b2) {
			System.out.println("�����ɹ���");
		}else {
			System.out.println("����ʧ�ܣ�");
		}
	}
}
