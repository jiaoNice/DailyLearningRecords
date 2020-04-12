package com.Jiao.demo01_map集合的特点;
/*
 * Map集合的特点：
 * 1.Map集合和Collection集合没有继承关系，所以不能直接用迭代器
 * 2.Collection集合 每一个元素都是单独存在
 * 	Map集合的每一个元素都是成对存在的
 * 3.Collection<E>一个泛型
 * 	Map<K,V>两个泛型，K代表键的类型，V代表值的类型
 * 	K,V可以相同，也可以不同，必须都是引用类型
 * 4.在Map集合的元素中，键是唯一的，值可以是重复的
 * 5.常用的实现类：
 * 	HashMap：无序
 * 		底层哈希表结构，保证键的唯一性，需要重写键对应的hashCode和equals方法
 * 	LinkedHashMap：有序
 * 		底层哈希表结构+链表结构，哈希表保证键的唯一性，链表保证元素的有序
 * 			需要重写键对应类的hashCode和equals方法
 */
public class MapDemo {

}
