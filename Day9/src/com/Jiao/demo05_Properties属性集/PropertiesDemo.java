package com.Jiao.demo05_Properties���Լ�;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
 * �ڿ�����Map���Ͽ����õ�������Properties���Լ���10000%���õ�
 * 1.Properties�ൽ����ʲô��
 * 	���Լ�
 * 	class Properties extends HashTable implements Map
 * 	���ԣ�Properties������ ����һ��Map����
 * 2.Properties��һ���־õ����Լ�
 * 	��ν�־þ����������Լ�д���ݵ��ļ��ķ���
 * 3.Properties��û�з��ͣ������ǹ̶���String��String
 * 4.Properties�࣬����Map�ӿڵ�һ�з���
 * 	����һЩ�Լ����еķ���
 * 	String getProperty(String key);��ָ���ļ��ڴ������б����������Ե�ֵ�����ܺ�Map��getһ��
 * 	Object setProperty(String key,String value);��Ӽ�ֵ�ԣ����ܺ�Map��put����һ��
 * 	Set<String> stringPropertyNames();��Map��keySet����һ��
 * 5.Properties���г־û����ļ��Ĺ���
 * 	store();//�������ݵ��ļ���ʵ���ϲ��Ǳ��浽�ļ�������д�뵽���У�����д���ļ�
 * 	load();//���ļ��м������ݣ�ʵ���ϲ���ֱ�Ӽ����ļ������Ǽ������е����ݣ������������ǴӸ��ļ��ж�ȡ��
 */
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		//��properties�־û��йصķ���
		Properties p = new Properties();
		//���ļ��ж�ȡ����
		p.load(new FileReader("names.properties"));
		System.out.println(p);
	
	}
	//Properties�־û����ݵ��ļ���
	public static void demo02() throws IOException {
		//��Properties�־û��йصķ���
		//1.����Properties
		Properties p = new Properties();
		p.setProperty("15","tom");
		p.setProperty("17","marry");
		p.setProperty("19","daw");
		//2.��p�����ݳ־û����ļ���
		p.store(new FileWriter("names.properties"),"tips");
	
	}
	public static void demo01() {
		//1.����һ��Properties
				Properties p = new Properties();
				//2.�������
				p.setProperty("12","tony");
				p.setProperty("21","vivi");
				p.setProperty("17","dey");
				//3.����
				//1.stringPropertyNames ��keySet ��ͬ
				Set<String> s = p.stringPropertyNames();
				Iterator<String> it = s.iterator();
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key+"���"+p.getProperty(key));
				}
				//2.
	}
}
