package com.Jiao.Demo01_集合;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection根接口中定义的方法：这些方法，所有的集合类都具有
 * 增：添加方法
 * 	boolean add(E e);//添加一个元素，返回值表示是否添加成功
 * 删：删除方法
 * 	boolean remove(Object obj);//删除某一个元素，返回值表示是否删除成功
 * 改：修改元素
 * 	无
 * 查：获取某个元素
 * 	无
 * 其他：
 * 	int size();//获取长度
 * 	void clear();//删除所有元素
 * 	boolean contains(Object obj);//判断是否包含obj元素
 * 	Object[] toArray();//集合转换成数组
 * 
 * 
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//1.创建一个集合对象,使用多态
		Collection<String> names = new ArrayList<String>();
		//2.添加
		names.add("海绵宝宝");
		names.add("派大星");
		names.add("Tom");
		names.add("杰瑞");
		//3.打印
		System.out.println(names);
		//4.删除
		boolean b = names.remove("Tom");
		System.out.println(b);
		System.out.println(names);
		//5.获取长度
		System.out.println(names.size());
		//6.清空
//		names.clear();//和names = null不同
		System.out.println(names);
		System.out.println(names.size());
		//7.判断是否包含
		//性能较低
		System.out.println(names.contains("Tom"));
		//8.转成数组   用的较少
		Object[] objects = names.toArray();
		for(int i = 0;i<objects.length;i++) {
			System.out.println(objects[i]);
		}
	}
}
