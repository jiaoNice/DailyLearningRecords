package com.Jiao.demo03_FileWriter;
/*
 * 以下三个语句效果相同：
 * OutputStreamWriter osw = new OutputStreamWriter(new OutputStream("1.txt");
 * OutputStreamWriter osw = new OutputStreamWriter(new OutputStream("1.txt"),"GBK");
 * FileWriter fw = new File Writer("1.txt");
 * 
 * 所以，如果是生成GBK文档，建议使用FileWriter
 * 注意：一旦要指定其他编码时，绝对不能用子类，必须使用字符转换流。
 * 
 */
public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
