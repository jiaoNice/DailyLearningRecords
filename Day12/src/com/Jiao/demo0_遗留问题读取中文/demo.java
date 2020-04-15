package com.Jiao.demo0_遗留问题读取中文;

import java.util.Scanner;

import com.Jiao.demo0_遗留问题读取中文.Student.calen;

/*
 *  1.当使用字节流读取中文，可能会出现乱码
 *  	出现乱码的原因：读取中文读了一半
 *  *2.解决方案：
 *  	a.字符流
 *  	b.转换流
 *  3.字符编码表（字符集）：
 *  	3.1 ASCII码表，美国发明的，保存了数字、字母、以及一些符号对应的数字，每一个字符都是一个字节
 *  		A-65 a-97 0-48   0xxx xxxx（第一位没用到）永远是正数
 *  	3.2 GB2312简体中文码表，保存了常用的汉字（6000-7000个），一个中文占两个字节，而且这两个字节都是负数
 *  		比如： 中 1111 1010 1010 1101（第一位是0为正数，1为负数）
 *  	3.3 GBK码表：保存了基本所有的汉字（20000多个），不管是中文还是英文，统统2个字节
 *  		而且这两个字节第一个是负数，第二个可能是负数也可能正数
 *  	3.4 180多个码表，国际上进行了规定，统一码表Unicode（万国码表）
 *  		不管是英文中文任何文字符号，均为2个字节
 *  		A-65-0000 0000 0100 0001
 *  		a-97-0000 0000 0110 0001
 *  	3.5 UTF-8码表：是在Unicode码表的基础上，做了一些优化：
 *  		一个字节就可以存储的数据，不用两个字节存储，
 *  		而且这个码表更加的标准化，在每一个字节头部加入了编码信息（后期到API中查找）
 *  	结论：
 *  	在GBK码表中 一个中文2个字节，在UTF-8中一个中文3个字节
 *  对于我们来说，用到的中文码表：GBK，UTF-8
 *  ISO-8859-1：拉丁码表，我们以后学习服务器Tomcat
 *  GB18030：最新的中文码表，目前还没正式使用
 *  
 *  编码：把具体的文字---->对应码值
 *  	
 *  解码：把码值----->翻译成具体的文字
 *  
 *  
 */
public class demo {

	public static void main(String[] args) {
			String n = "不吃饭";
			switch(n) {
				case "吃饭":
					System.out.println("case1");
					break;
				case "吃了":
					System.out.println("case2");
					break;
				default:
					System.out.println("default");
					break;
			}
			//枚举的使用
			Student st = new Student();
			st.sex = calen.boy;
	}

}
