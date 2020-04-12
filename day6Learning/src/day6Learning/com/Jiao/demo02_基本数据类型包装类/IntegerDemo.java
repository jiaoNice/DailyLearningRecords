package day6Learning.com.Jiao.demo02_基本数据类型包装类;
/*
 * 基本类型包装类：基本数据类型  对应的引用类型
 * 	基本类型：byte boolean char short int long float double
 * 	包装类型：Byte Boolean Character Short Integer Long Float Double
 * 他们直接用法的区别：
 * 1.在集合中只允许存储 包装类型 不能存储基本类型
 * 2.实现字符串的转换
 * 	比如 Integer用public static int parseInt(String s);
 * 	比如Double 用public static double parseDouble(String s);
 * 	
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//java工程师 做后台
		String age = "19";
		//第二年 age 需要加1
		int a = Integer.parseInt(age);
		a++;
		//身高
		String height = "178.3";
		Double h = Double.parseDouble(height);
		
	}
}
