package day6Learning.com.Jiao.demo02_�����������Ͱ�װ��;
/*
 * �������Ͱ�װ�ࣺ������������  ��Ӧ����������
 * 	�������ͣ�byte boolean char short int long float double
 * 	��װ���ͣ�Byte Boolean Character Short Integer Long Float Double
 * ����ֱ���÷�������
 * 1.�ڼ�����ֻ����洢 ��װ���� ���ܴ洢��������
 * 2.ʵ���ַ�����ת��
 * 	���� Integer��public static int parseInt(String s);
 * 	����Double ��public static double parseDouble(String s);
 * 	
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//java����ʦ ����̨
		String age = "19";
		//�ڶ��� age ��Ҫ��1
		int a = Integer.parseInt(age);
		a++;
		//���
		String height = "178.3";
		Double h = Double.parseDouble(height);
		
	}
}
