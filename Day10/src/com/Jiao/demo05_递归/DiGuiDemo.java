package com.Jiao.demo05_递归;
/*
 * 递归：是一个通用技术，所有的编程语言，只要有方法概念的编程语言都具有递归
 * 什么叫递归：
 * 	在一个方法的内部，再调用方法本身
 * 无限递归本身是错误的，因为方法运行需要进栈，而栈空间不是无限大的
 * 使用递归的前提：
 * 	1.必须有一个可以让递归结束的出口（否则会发生栈内存溢出）
 * 	2.递归的次数，不能太多（具体的次数不好确定，与内存，CPU...都有关）（否则也会发生栈内存溢出）
 * 	构造方法禁止递归
 * 
 * 我们建议在开发中，能不用递归就不要用
 * 	急剧消耗内存（最常见是杀毒软件  扫描硬盘）
 * 
 * 递归的其他分类：
 * 	直接递归：
 * 		在A方法的内部 直接调用A方法
 * 	间接递归：
 * 		在A方法的内部调用B方法，在B方法的内部调用C方法，在C方法的内部调用A方法
 * 
 * 练习：使用递归求1+2+3+...+n
 * 	使用递归注意两点：
 * 	1.明确你定义的方法的作用
 * 	2.找规律
 * 		1+2+3...+10=
 * 
 */
public class DiGuiDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		getSum(1,50,0);
		System.out.println(mul(5));//5*4*3*2*1=20*6=120
		System.out.println(mul(3));
	}
	//建议
	public static int sum(int n) {
		int sum = 0;
		for(int i = n;i>0;i--) {
			sum += i;
		}
		return sum;
	}
	//递归
	public static int getSum(int n) {
		if(n==1)
			return 1;
		return getSum(n-1)+n;
	}
	//定义方法 求1*2*3...*n
	public static int mul(int n) {
		if(n == 1)
			return 1;
		return mul(n-1)*n;
	}
}
