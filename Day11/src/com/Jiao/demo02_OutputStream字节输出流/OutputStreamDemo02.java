package com.Jiao.demo02_OutputStream�ֽ������;
/*
 * FileOutputStream����д�ͻ������⣺
 * 
 * ��д��
 * 	��ǰ�õĹ��죺
 * 		public FileOutputStream(String filename);//Ĭ�ϲ���д
 * 		public FileOutputStream(File file);//����һ��File�������File�����������Ҫд����ļ�
 * 
 * 	��д����������죺
 * 		public FileOutputStream(String filename,boolean flag);
 * 		public FileOutputStream(File file,boolean flag);
 * 
 * ���У�
 * 	Windows��\r\n
 * 	Linux:\n
 * 	Mar:\r
 * 
 * 
 */
import java.io.FileOutputStream;

/*
 * FileOutputStream���ļ�����д�ͻ������⣺
 * 
 */
public class OutputStreamDemo02 {
	public static void main(String[] args) throws Exception {
		//1.����������
		FileOutputStream fos = new FileOutputStream("1.txt");
		//2.д����
//		byte[] bs = "�Ұ������찲��".getBytes();
//		fos.write(bs);
		fos.write("�Ұ������찲��".getBytes());
		//��д����
		FileOutputStream fos2 = new FileOutputStream("1.txt",true);
		fos2.write("\r\n������д����".getBytes());
		//3.�ر���
		fos.close();
	}
}
