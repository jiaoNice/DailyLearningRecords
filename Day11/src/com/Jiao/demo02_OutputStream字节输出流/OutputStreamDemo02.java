package com.Jiao.demo02_OutputStream字节输出流;
/*
 * FileOutputStream的续写和换行问题：
 * 
 * 续写：
 * 	以前用的构造：
 * 		public FileOutputStream(String filename);//默认不续写
 * 		public FileOutputStream(File file);//给定一个File对象，这个File对象代表我们要写入的文件
 * 
 * 	续写请用这个构造：
 * 		public FileOutputStream(String filename,boolean flag);
 * 		public FileOutputStream(File file,boolean flag);
 * 
 * 换行：
 * 	Windows：\r\n
 * 	Linux:\n
 * 	Mar:\r
 * 
 * 
 */
import java.io.FileOutputStream;

/*
 * FileOutputStream给文件中续写和换行问题：
 * 
 */
public class OutputStreamDemo02 {
	public static void main(String[] args) throws Exception {
		//1.创建流对象
		FileOutputStream fos = new FileOutputStream("1.txt");
		//2.写数据
//		byte[] bs = "我爱北京天安门".getBytes();
//		fos.write(bs);
		fos.write("我爱北京天安门".getBytes());
		//续写数据
		FileOutputStream fos2 = new FileOutputStream("1.txt",true);
		fos2.write("\r\n我是续写数据".getBytes());
		//3.关闭流
		fos.close();
	}
}
