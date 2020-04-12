package com.Jiao.demo06_可变参数;
/*
 * 可变参数：说的不是参数类型可变，而是参数的个数可以变化
 * 语法：JDK1.5 出现新特性
 * 	public 返回值类型  方法名（数据类型...  参数名）{}
 * 	注意：
 * 	1.可变参数只是参数的个数是任意个，参数的类型不能改变
 * 	2.一个方法中，只能有一个可变参数
 * 	3.当一个方法中有多个参数，并且有一个是可变参数的时候，要求这个可变参数必须在最后
 * 可变参数的本质：就是一个数组
 */
public class VariableArgumentsDemo {

	public static void main(String[] args) {
		add(12,13);
		add(21,45,65);
	}
	public static void add(int... a) {
		int sum = 0;
		for(int n:a) {
			sum+=n;
		}
		System.out.println(sum);
	}
}
