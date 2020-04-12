package com.Jiao.Demo05_contains方法的原理;
/*
 * 1.哈希表结构：HashSet，LinkedHashSet
 * 	判断元素重复不重复的原理：
 * 	1.1比较哈希值
 * 	1.2调用equals方法
 * 	只有哈希值相同，并且equals方法返回true，才是重复元素，才不存储
 * 2.contains方法，判断是否包含某一个元素
 * 	ArrayList的contains方法：
 * 		names.contains("abc");//判断names集合中是否包含"abc"
 * 		只比较equals的返回值，如果某一个元素和要判断的元素equals方法true，
 * 		那么就是包含该元素
 * 	HashSet的contains方法：原理和add方法一样
 * 		set.contains("abc");//
 * 		先判断哈希值，再使用equals方法，只有旧元素和判断的元素的哈希值相同，
 * 		并且equals方法true，才判定包含
 */
public class ContainsDemo {

}
