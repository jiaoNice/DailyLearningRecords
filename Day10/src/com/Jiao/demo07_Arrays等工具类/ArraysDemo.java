package com.Jiao.demo07_Arrays�ȹ�����;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Coolections���Ϲ����ࣺ
 * 	public static void shuffle(List l);//���Ҽ��ϵ�˳��
 * 	public static void sort(List l);//�Ѽ��ϰ�����Ȼ˳��123��abc������
 * 
 * Arrays�ࣺ���鹤����
 * 	public static List asList(����/�ɱ����);//��һ������ת��List����
 *  public static void sort(����);//��������
 *  public static String toString(����);//������ת���ַ���
 *  
 * 
 */
public class ArraysDemo {

	public static void main(String[] args) {
		int[] nums = {1,2,3,42,43,1};
		List li = Arrays.asList(nums);
		System.out.println(li);
		List<Integer> nn = Arrays.asList(1,2,3,42,43,1);
		System.out.println(nn);
		Collections.sort(nn);
		for(int i:nn) {
			System.out.print("#"+i);
		}
		System.out.println();
		Arrays.sort(nums);
		for(int i:nums) {
			System.out.print("#"+i);
		}
	}

}
