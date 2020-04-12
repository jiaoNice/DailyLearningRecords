package com.Jiao.Demo02_对象的哈希值;
/*
 * 字符串的哈希值：
 * 	由于String类重写了HashCode  哈希值不再通过地址值计算
 * 	我们观察源码，发现通过字符串的内容计算，那么只要字符串内容相同，哈希值必定相同
 * 思考：
 * 	只要字符串内容一样，哈希值必定一样
 * 	两个字符串的内容不一样,哈希值可能一样。
 * 	比如：abc和acD,重地 和  通话
 */
public class StringHashCodeDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1==s2);//比较的就是真正的地址值,false
		System.out.println(s1.hashCode()==s2.hashCode());//true,
		System.out.println(s1.equals(s2));//true,比较内容
		System.out.println(s1.hashCode());
		//如果两个字符串的哈希值一样，那么内容可能不一样
		System.out.println("重地".hashCode()=="通话".hashCode());
		System.out.println("abc".hashCode()=="acD".hashCode());
	}
}
