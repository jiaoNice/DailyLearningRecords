package com.Jiao.demo03_Map集合第二种遍历方式键值对遍历;

import com.Jiao.demo03_Map集合第二种遍历方式键值对遍历.OuterInterface.InnerInterface;

public interface OuterInterface {
	public abstract void showOut();
	//内部接口
	interface InnerInterface{
		public abstract void showIn();
	}
}
//定义两个实现类
//1.实现外部接口
class c1 implements OuterInterface{
	public void showOut() {
		System.out.println("实现外部接口");
	}
}
//2.实现内部接口
//外部接口.内部接口
//不写也行？
class c2 implements InnerInterface{
	public void showIn() {
		System.out.println("实现内部接口");
	}
}
class c3 implements OuterInterface.InnerInterface{
	public void showIn() {
		System.out.println("通过OuterInterface.InnerInterface实现内部接口");
	}
}