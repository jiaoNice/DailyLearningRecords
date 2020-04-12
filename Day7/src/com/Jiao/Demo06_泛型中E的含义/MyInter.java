package com.Jiao.Demo06_泛型中E的含义;

public interface MyInter<Q> {
	public abstract void show(Q q);
}
//1.当子类实现接口的时候，确定接口上的泛型
class Myclass1 implements MyInter<String>{
	public void show(String q) {
		
	}
}
//2.当子类实现接口的时候，还不确定泛型，把接口的泛型继续实现下来
//当实现类创建对象的时候确定
class MyClass2<Q> implements MyInter<Q>{
	public void show(Q q) {
		
	}
}
