package com.Jiao.Demo03_哈希值结构;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * 哈希表结构：
 * 	数组结构+链表结构的组合，查询快，增删快
 * HashSet：采用了哈希表结构
 * LinkedHashSet：采用了链表+哈希表结构
 * Set集合中有三个特点：
 * 	1.无下标 2.无序（LinkedHashSet和TreeSet除外） 3.不能重复
 * 哈希表结构，判断元素是否重复的原理：
 * 	1.先判断新元素的哈希值和所有旧元素的哈希值是否相同
 * 		如果都不相同，直接判断不重复，添加
 * 	2.如果哈希值相同，再调用 新元素 和哈希值相同的旧元素的equals方法
 * 		如果返回值是true，判定重复元素，不添加
 * 		如果返回值是false，判定不重复,添加
 * 总结：
 * 	只有哈希值相同，并且equals返回false，才判定重复
 */
public class HashCodeDemo {
	public static void main(String[] args) {
		//无序
//		HashSet<String> s = new HashSet<String>();
//		s.add("java");
//		s.add("abc");
//		s.add("ccc");
//		s.add("acD");
//		s.add("重地");
//		s.add("abc");
//		s.add("通话");
//		System.out.println(s);
		
		//有序
		HashSet<String> s = new LinkedHashSet<String>();
		s.add("java");
		s.add("abc");
		s.add("ccc");
		s.add("acD");
		s.add("重地");
		s.add("abc");
		s.add("通话");
		System.out.println(s);
	}
}
