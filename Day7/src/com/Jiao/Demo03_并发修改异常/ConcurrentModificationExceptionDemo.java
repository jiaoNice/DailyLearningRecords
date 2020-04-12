package com.Jiao.Demo03_并发修改异常;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 使用Iterator对象或者增强for循环遍历集合
 * 如果出现“itcast”字符串
 * 那么向集合中添加一个“ITCAST”字符串
 * 
 * 此问题引发了一个异常：
 * 	Concurrent（并发）Modification（修改）Exception
 * 	java规定，如果一个集合使用迭代器遍历，那么在遍历的过程中 不允许修改集合的长度（增加或者删除）
 * 
 */
public class ConcurrentModificationExceptionDemo {
	public static void main(String[] args) {
		//1.定义一个集合
		Collection<String> itStrings = new ArrayList<String>();
		itStrings.add("netease");
		itStrings.add(null);
		itStrings.add("itcast");
		itStrings.add("baidu");
		Iterator<String> itnames = itStrings.iterator();
		for(int i = 0;i<itStrings.size();i++) {
			if (itnames.hasNext()) {
				String s = itnames.next();
				//注意此处，将常量放前面，变量放括号里
				if("itcast".equals(s)) {
					itStrings.add("ITCAST");
				}
			}
		}
	}
}
