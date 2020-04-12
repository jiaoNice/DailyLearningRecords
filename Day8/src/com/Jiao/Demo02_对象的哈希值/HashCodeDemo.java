package com.Jiao.Demo02_对象的哈希值;
/*
 * 对象的哈希值：
 * 	任何对象，都有一个哈希值，哈希值是对象的一个数字表示
 * 	对象的字符串表示，toString方法，默认表示格式:包名.类名@地址值
 * 1.如何获取对象的哈希值？
 * 	每一个对象都有一个方法，hashCode方法，这方法定义在了Object类中，所以每个对象都具有
 * 2.我们以前说的地址值，实际上根本不是地址值，而是哈希值的十六进制
 * 3.在java中怎么看真正的地址值？看不了
 * 4.哈希值的由来
 * 	是由真正的地址值计算的，通过一种散列算法（哈希算法）（不可逆算法）
 * 	所以一般来说 地址值不同，哈希值也是不一样的
 * 5.不可逆算法（MD5,WPA2）
 * 6.碰撞算法（一个一个试）
 * 7.暴力破解&字典破解（破解WiFi教程）
 * 
 * 
 */
public class HashCodeDemo {
	public static void main(String[] args) {
		Person p = new Person();
		int pHC = p.hashCode();
		System.out.println(pHC);
		System.out.println(p);
	}
}
