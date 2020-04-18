package com.Jiao.demo01_OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter:����һ���ַ���
 * 		extends Writer
 * 		������дһ���ַ���дһ���ַ����飨һ���֣���дһ���ַ�����һ���֣�
 * 		������OutputStreamWriter ���ַ���ͨ���ֽ�������������������룩
 * OutputStreamWriter�Ĺ��죺
 * 	public OutputStreamWriter(OutputStream out);//Ĭ��GBK
 * 	public OutputStreamWriter(OutputStream out,String charsetName);//����ʹ��ָ���ַ�����OutputStreamWriter����
 * ������
 * 		void write(int c);//д�뵥���ַ�
 * 		void write(String str,int off,int len);//д���ַ�����ĳһ����
 * 		void write(char[] cbuf,int off,int len);//д���ַ������ĳһ����
 * 		String getEncoding();//���ظ���ʹ�õ��ַ����������
 * 
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException{
		//1.������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("1.txt"));
		//2.
		osw.write(48);
		osw.write("�ҳԷ���");
		char[] cs = {48,49,50,51,52,65,89};
		osw.write(cs);
		osw.write("�����˰ɻ���",0,3);
		System.out.println(osw.getEncoding());
		//3.�ر���
		osw.close();
	}

}
