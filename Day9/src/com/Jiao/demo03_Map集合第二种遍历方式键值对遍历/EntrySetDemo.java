package com.Jiao.demo03_Map集合第二种遍历方式键值对遍历;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 内部类：一个类A，定义在另外一个类B的内部，这个类A被称为内部类
 * 内部接口：一个接口A，定义在另外一个接口B的内部，这个接口A被称为内部接口
 * Map集合第二种遍历：键值对遍历
 * 	1.获取Map集合中所有键值对关系对象的集合 （结婚证对象）
 * 		Set<Map.Entry<K,V>> set = Map集合.entrySet();
 * 	2.遍历这个Set集合，获取每一个Map.Entry类型的对象
 * 		a.迭代器b.foreach
 * 	3.获取到Map.Entry类型的对象之后
 * 		K key = entry.getKey();
 * 		V value = entry.getValue();
 */
public class EntrySetDemo {
	public static void main(String[] args) {
		//1.创建一个Map集合
		Map<Integer, String> student = new LinkedHashMap<Integer,String>();
		//2.添加键值对
		student.put(1511112,"李白");
		student.put(1946223,"杜甫");
		student.put(1313123, "张曦之");
		//3.获取所有键值对关系对象的集合
		//导包然后Entry,或者Map.Entry
		Set<Map.Entry<Integer,String>> es  = student.entrySet();
		//4.遍历这个Entry集合，拿出每一个对象
		//使用迭代器遍历
		Iterator<Map.Entry<Integer, String>> it = es.iterator();
		Iterator<Entry<Integer, String>> iterator = es.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
		}
		
		/*//一个疑问：实现内部接口时，需要 外部接口.内部接口，测试发现不写外部接口.也行
		//访问外部类
		OuterClass oc = new OuterClass();
		//访问内部类
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		OuterClass.InnerClass ii = oc.new InnerClass();
		c1 c1 = new c1();
		c1.showOut();
		c2 cc = new c2();
		cc.showIn();
		c3 ccC3 = new c3();
		ccC3.showIn();*/
	}
}
