package day6Learning.com.Jiao.Math��;
/*
 * Math����ѧ��
 * 	public final class Math:����಻�ܱ��̳� �� Systemһ��
 * ���಻�ܴ������󣬵������Ƿ��ָ��������еķ������Ǿ�̬��
 * 
 * 1.public static double max(double d1,double d2);//�����ֵ
 * 2.public static double min(double d1,double d2);//����Сֵ
 * 
 * 3.public static double abs(double d);//ȡ����ֵ
 * 4.public static double random();//����һ�����������Χ[0,1]
 * 5.public static long round(double d);//��������,ֻ��С���ĵ�һλ
 * 6.public static double pow(double d1,double d2);//��η���d1��d2����
 * 7.public static double ceil(double a);//�컨��  ����ȡ��
 * 8.public static double floor(double a);//�ذ�   ����ȡ��
 * 
 * 
 * 
 */
public class MathDemo {
	public static void main(String[] args) {
//		boolean b=Double.isNaN(Float.NaN);
		/*//1.�����ֵ
		int n = Math.max(12, 23);
		System.out.println(n);
		//2.����Сֵ
		int i = Math.min(12, 5);
		System.out.println(i);
		//3.�����ֵ
		double d = 1.2;
		d = Math.abs(d);
		System.out.println(d);*/
		
		/*//4.��ȡα�����
		float f = 0.0f;
		double d2 = Math.random();
		System.out.println(d2);
		//���������λ����
		int d = (int)(Math.random()*90+10);
		System.out.println(d);*/
		
		//5.��������
		double d3 = 13.66;
		d3 = Math.round(d3);
		System.out.println(d3);
		
		//6.�����
		double d = Math.pow(2, 3);
		System.out.println(d);
		//8.ceil��floor
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.floor(3.14));
		System.out.println(Math.ceil(-3.14));
		System.out.println(Math.floor(-3.14));
		
	}
}
