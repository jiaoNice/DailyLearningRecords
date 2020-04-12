package com.Jiao.Demo09_总结;
/*
 * 1.集合框架
 * 	根接口：Collection
 * 		子接口：List，Set，Queue
 * 		实现类：
 * 			List--->ArrayList，LinkedList，Vector
 * 			Set--->HashSet，LinkedHashSet，TreeSet
 * 2.Collection接口中的公共方法：
 * 	增：add(E e);
 * 	删：remove(Object obj);
 * 	改：无
 * 	查：无
 * 	其他：
 * 		int size();//长度
 * 		boolean contains(Object obj);
 * 		void clear();//清空
 * 		Object[] toArray();
 * 3.Collection中是没有下标的，
 * 	因为List有下标Set没有下标，Collection抽取是共性。
 * 	在Collection中定义一种公共的遍历方式：迭代器遍历
 * 		Iterator<和集合的一样> it = 集合对象.iterator();
 * 	迭代器对象有两个方法：
 * 		hasNext();//判断有没有下一个
 * 		next();//取出下一个
 * 		以上两个方法必须配合使用
 * 4.增强for循环
 * 	语法比普通的for循环更加简单
 * 	格式：
 * 	for(数据类型 变量名：数组/集合){}
 * 	使用增强for循环遍历集合的时候，底层使用的是迭代器遍历
 * 5.无论使用foreach循环  或者迭代器遍历集合
 * 	不能修改集合的长度，否则就会出现ConcurrentModificationException异常
 * 6.泛型：
 * 	不确定的类型
 * 	本质：是一个“变量”，用来接收一种数据类型
 * 	泛型可以用在类上，方法上，接口上
 * 	1.泛型类的泛型什么时候确定？创建该类对象的时候确定
 * 	2.泛型方法的泛型什么时候确定？调用该方法并传递参数的时候确定
 * 	3.泛型接口的泛型什么时候确定？【1】实现类实现接口的时候直接确定【2】实现类也不确定，当实现类创建对象的时候确定
 * 7.泛型通配符
 * 	? ：泛型通配符
 * 	<? extends 类名>:代表泛型必须是该类的子类或者该类本身
 * 	<? super 类名>:代表泛型必须是该类的父类或者该类本身
 * 
 */
public class SummaryDemo {

}
