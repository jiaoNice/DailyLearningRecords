package day6Learning.com.Jiao.demo03_自动拆箱装箱;
/*
 * 自动拆箱和自动装箱：
 * 		int Integer
 * 拆箱：包装类型----->基本类型
 * 
 * 装箱：基本类型----->包装类型
 * 以后遇到基本类型 和对应的包装类型 进行计算的时候，完全按照基本类型进行计算就可以
 * 	public class Dog{
 * 		int age;
 * 		//Integer age;
 * 	}
 * Dog d = new Dog();
 * d.age = 10;
 * 
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//1.自动装箱案例
		Integer i = 10;//自动的把10（int类型） 装箱成Integer类型
		//2.自动拆箱
		i++;//i=(i+1) (Integer+int)===>(int+int)
		
		
	}
}
