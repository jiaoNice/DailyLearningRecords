package com.Jiao.Demo01_数据结构;

import java.util.LinkedList;

/*
 *  List接口的特点：
 *  	a.有下标
 *  	b.有序的（有序不是自然顺序，不是123，abc，有序指的是存和取的顺序 一致）
 *  	c.可重复
 *  	实现类：ArrayList，LinkedList，Vector
 *  	ArrayList:底层采用数组结构，查询快，增删慢
 *  	LinkedList:底层采用链表结构，查询慢，增删快
 *  	Vector：底层采用数组结构，查询快，增删慢
 *  	List结构中具有的方法：
 *  	增：add(E e);add(int index,E e);
 *  	删：remove(Object obj);remove(int index);
 *  	改：set(int index,E e);
 *  	查：get(int index);
 *  	其他：size();clear();contains(Object obj);toArray();
 *  		iterator();isEmpty();
 *  	实现类的方法：
 *  	1.ArrayList：方法基本上和List中定义一模一样
 *  	2.LinkedList：除了和List接口中一样的方法之外
 *  		LinkedList提供了大量首尾操作的方法
 *  		第一组：
 *  		void addFirst(E e);
 *  		void addLast(E e);
 *  		第二组：
 *  		E removeFirst();//删除首个元素，返回被删除的元素
 *  		E removeLast();//
 *  		第三组：
 *  		E getFirst();
 *  		E getLast();
 *  		第四组：
 *  		E pop();//弹出，删除集合中的某一个元素，和removeFirst效果相同
 *  		void push(E e);//推入，把一个元素添加到集合中，和addFirst效果相同
 *  
 */
public class ListDemo {

	public static void main(String[] args) {
		//1.测试LinkedList中四组特有方法
		LinkedList<String> c = new LinkedList<String>();
		//2.添加数据
		c.add("刘德华");
		c.add("郭德纲");
		c.addFirst("小岳岳");
		c.addFirst("李老怪");
		c.addLast("张总");
		c.addLast("铁拐李");
		//3.删除数据
		c.remove("张总");//boolean
		String first = c.removeFirst();//String
		String last = c.removeLast();//String
		//4.查询数据
		String f = c.getFirst();
		String l = c.getLast();
		//5.其他方法
		String p = c.pop();
		c.push("我是push");
//		System.out.println();
		System.out.println(c);
		
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("刘德华");
		c1.add("郭德纲");
		c1.addFirst("小岳岳");
		c1.addFirst("李老怪");
		c1.addLast("张总");
		c1.addLast("铁拐李");
		c1.removeAll(c1);//删除某collection集合的全部
		c1.clear();
		System.out.println(c1);
		
	}

}
