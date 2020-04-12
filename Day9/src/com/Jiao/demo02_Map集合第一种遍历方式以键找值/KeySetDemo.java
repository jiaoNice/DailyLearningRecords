package com.Jiao.demo02_Map集合第一种遍历方式以键找值;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合第一种遍历方法：以键找值
 * 1.先获取Map集合的键的集合，这个集合是一个Set集合
 * 		Set<K> keys = map集合.KeySet();
 * 2.遍历keys集合
 * 		a.foreach  b.迭代器
 * 3.在遍历的过程中，从Map集合获取键对应的值
 * 
 */
public class KeySetDemo {
	public static void main(String[] args) {
		//1.创建一个集合
		Map<Integer, String> names = new LinkedHashMap<Integer,String>();
		//2.添加键值对
		names.put(15114421, "邓超");
		names.put(14223134, "孙俪");
		names.put(16452233, "陈翔");
		//3.获取map的键的集合
		Set<Integer> sId = names.keySet();
		//4.遍历keys集合，获取到每一个值
		//4.1迭代器遍历
		Iterator<Integer> it = sId.iterator();
		while(it.hasNext()) {
			//根据键 从map集合查找对应值
			System.out.println(names.get(it.next()));
		}
		//4.2foreach
		for(int id : sId) {
			System.out.println(names.get(id));
		}
	}
}
