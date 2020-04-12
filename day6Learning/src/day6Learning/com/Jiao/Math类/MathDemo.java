package day6Learning.com.Jiao.Math类;
/*
 * Math：数学类
 * 	public final class Math:这个类不能被继承 和 System一样
 * 该类不能创建对象，但是我们发现该类中所有的方法都是静态的
 * 
 * 1.public static double max(double d1,double d2);//求最大值
 * 2.public static double min(double d1,double d2);//求最小值
 * 
 * 3.public static double abs(double d);//取绝对值
 * 4.public static double random();//返回一个随机数，范围[0,1]
 * 5.public static long round(double d);//四舍五入,只看小数的第一位
 * 6.public static double pow(double d1,double d2);//求次方，d1的d2次幂
 * 7.public static double ceil(double a);//天花板  向上取整
 * 8.public static double floor(double a);//地板   向下取整
 * 
 * 
 * 
 */
public class MathDemo {
	public static void main(String[] args) {
//		boolean b=Double.isNaN(Float.NaN);
		/*//1.求最大值
		int n = Math.max(12, 23);
		System.out.println(n);
		//2.求最小值
		int i = Math.min(12, 5);
		System.out.println(i);
		//3.求绝对值
		double d = 1.2;
		d = Math.abs(d);
		System.out.println(d);*/
		
		/*//4.获取伪随机数
		float f = 0.0f;
		double d2 = Math.random();
		System.out.println(d2);
		//随机生成两位整数
		int d = (int)(Math.random()*90+10);
		System.out.println(d);*/
		
		//5.四舍五入
		double d3 = 13.66;
		d3 = Math.round(d3);
		System.out.println(d3);
		
		//6.求次幂
		double d = Math.pow(2, 3);
		System.out.println(d);
		//8.ceil和floor
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.floor(3.14));
		System.out.println(Math.ceil(-3.14));
		System.out.println(Math.floor(-3.14));
		
	}
}
