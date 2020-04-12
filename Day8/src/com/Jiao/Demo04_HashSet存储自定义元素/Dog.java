package com.Jiao.Demo04_HashSet�洢�Զ���Ԫ��;

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
	
	//��д
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		//1.�迼�Ǽ̳У����ϸ�
		/*if(!(obj instanceof Dog)) {
			return false;
		}*/
		//2.�ϸ��ж������Ƿ���ͬ
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
		// TODO �Զ����ɵĹ��캯�����
	}
	
}
