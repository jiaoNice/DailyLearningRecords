package com.Jiao.demo01_map集合的特点;

import java.util.HashMap;
import java.util.Map;

/*
 * Map<K,V>集合常用的方法：
 * 增：put(K key,V value);//向集合中添加键值对
 * 		//如果集合中已存在该键，覆盖整个键值对，并且返回被覆盖的键值对的值（旧）
 * 删：remove(Object key);//根据键从map集合中删除键值对，返回值表示被删除的键值对的值
 * 改：隐藏到了put方法
 * 查：V get(K key);//根据键 从map集合中找到唯一对应的值
 * 
 */
public class MapMethodDemo {

	public static void main(String[] args) {
		//1.创建一个Map集合
		Map<String, String> map = new HashMap<String,String>();
		//2.添加键值对
		map.put("邓超", "beijing");
		map.put("孙俪", "beijing");
		map.put("买超", "shanghai");
		map.put("张嘉倪", "hangzhou");
		map.put("李晨", "007");
		System.out.println(map);
		String str = map.put("张嘉倪", "shanghai");
		System.out.println(map);
		//3.查询
		System.out.println(map.get("李晨"));
		//4.删除
		map.remove("李晨");
		System.out.println(map);
	}

}
