package com.Jiao.Demo04_增强for循环;

import java.security.AlgorithmParameterGeneratorSpi;
import java.util.ArrayList;
import java.util.Collection;

/*
 * 增强for循环比普通的for循环增强在哪？
 * 	增强在语法上更加简单
 * 格式：
 * 	for(数据类型  变量名:数组/集合){
 * 		syso(变量名);
 * 	}
 * 
 * 注意：
 * 	当你使用增强for循环遍历集合的时候
 * 	底层采用的是迭代器
 * 总结：当你使用增强for循环遍历集合时，不能修改集合的长度
 * 
 */
public class ForeachDemo {
	public static void main(String[] args) {
		String[] names = {"tom","lisa","vivi"};
		for(String name:names) {
			System.out.println(name);
		}
		Collection<Integer> ages = new ArrayList<Integer>();
		ages.add(12);
		ages.add(15);
		ages.add(13);
		for(Integer age:ages) {
			System.out.println(age);
//			ages.add(11);
		}
	}
}
