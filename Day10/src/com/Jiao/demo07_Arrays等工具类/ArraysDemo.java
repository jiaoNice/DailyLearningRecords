package com.Jiao.demo07_Arrays等工具类;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Coolections集合工具类：
 * 	public static void shuffle(List l);//打乱集合的顺序
 * 	public static void sort(List l);//把集合按照自然顺序（123，abc）排序
 * 
 * Arrays类：数组工具类
 * 	public static List asList(数组/可变参数);//把一个数组转成List集合
 *  public static void sort(数组);//排序数组
 *  public static String toString(数组);//把数组转成字符串
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
