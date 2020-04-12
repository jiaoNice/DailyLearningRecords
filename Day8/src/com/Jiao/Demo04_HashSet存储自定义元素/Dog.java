package com.Jiao.Demo04_HashSet存储自定义元素;

public class Dog {
	int age;
	String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//重写
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		//1.需考虑继承，不严格
		/*if(!(obj instanceof Dog)) {
			return false;
		}*/
		//2.严格判断类型是否相同
		if(getClass()!=obj.getClass()) {
			return false;
		}
		Dog dog = (Dog)obj;
		if(age != dog.age) {
			return false;
		}
		if(name == null) {
			if(dog.name!=null) {
				return false;
			}
		}else if(!name.equals(dog.name)) {
			return false;
		}
		return true;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Dog() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
}
