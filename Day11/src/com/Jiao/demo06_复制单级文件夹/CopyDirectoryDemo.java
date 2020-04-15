package com.Jiao.demo06_���Ƶ����ļ���;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirectoryDemo {

	public static void main(String[] args) throws IOException {
		//0.�ȶ���Դ�ļ��к�Ŀ���ļ���
		File fileSrc = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\�½��ļ���");
		File fileObj = new File("C:\\Users\\��Ǹ\\Desktop\\java�ʼ�\\����copy��");
		//1.�ж�Ŀ���ļ����Ƿ����
		if(!fileObj.exists()) {
			boolean b = fileObj.mkdir();
			if(b)
				System.out.println("Ŀ���ļ��в����ڣ��ɹ�����һ����");
		}else {
			System.out.println("Ŀ���ļ����Ѵ��ڣ�����Ҫ������ֱ�Ӹ��Ƽ��ɣ�");
		}
		//2.�г�Դ�ļ��������е��ļ�����
		File[] files = fileSrc.listFiles();
		for(File f:files) {
			if(f.isFile()) {
				File nF = new File(fileObj,f.getName());
				copyFile(f,nF);
			}
				
		}
		System.out.println("copy�ɹ�");
	}
	public static void copyFile(File oldFile,File newFile) throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(oldFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		byte[] bs = new byte[1024];
		int len = 0;
		while((len=bis.read(bs))!=-1) {
			bos.write(bs,0,len);
		}
		bos.close();
		bis.close();
		System.out.println("����"+newFile.getName()+"�ɹ�");
	}

}
