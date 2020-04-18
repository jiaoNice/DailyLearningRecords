package com.Jiao.demo05_序列化异常和无效类异常;
/*
 * 1.NotSerializableException异常：
 * 		当需要序列化一个对象时，但是对象所属的类，没有实现java.io.Serializable接口
 * java.io.Serializable接口中没有方法，标记
 * 		如果一个类 有标记 可以序列化，没有标记就不能序列化
 * 	
 * 2.InvalidClassException:无效类异常
 * 		当写完一个对象之后，修改该对象所属的类，那么再次读取对象的时候，原来的类失效，这时会出现无效类异常
 * 
 * 底层：
 * 		JVM如何判断一个类是否是有效的？通过一个类的版本号判断的
 * 		当你写完一个类的时候，内部有一个版本号，当你修改这类的时候，这时版本号就会发生变化
 * 		这个版本号 也可以交给程序员自己管理
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
