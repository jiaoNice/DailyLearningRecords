package com.Jiao.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * 1.生成牌
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 * Collections叫做集合工具类
 * Collections.shuffle(cards);
 */
public class DouDiZhuDemo {
	public static void main(String[] args) {
		douDiZhu();
		/*String names = "季莉婷；林承泽；焦怡诺；陈羿如；林辰宇；李冬玥；林一诺；林峻宇；林一乐；焦梓桐；高赫；尹钲恩；";
		names = names.replaceAll("；", "、");
		System.out.println(names);*/
	}
	
	public static void douDiZhu() {
		//1.生成一副牌
		ArrayList<String> cards = new ArrayList<String>();
		//每一张花色 ：♥ ♠ ♦ ♣
		//每一张数值：A 1 2 3 4 5 6 7 8 9 10 J Q K
		String[] colors = {"♥","♠","♦","♣"};
		String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(String color:colors) {
			for(String num:nums) {
				String card = color + num;
				cards.add(card);
			}
		}
		//添加大小王
		cards.add("大王");
		cards.add("小王");
		
		//2.洗牌，Collections叫做集合工具类
		Collections.shuffle(cards);
		
		//3.发牌
		//定义三个玩家集合，存储各自的牌
		ArrayList<String> p1 = new ArrayList<String>();
		ArrayList<String> p2 = new ArrayList<String>();
		ArrayList<String> p3 = new ArrayList<String>();
		ArrayList<String> dp = new ArrayList<String>();
		//循环取出cards集合中的牌 依次保存到三个集合中
		for(int i = 0;i<cards.size();i++) {
			String card = cards.get(i);
			//i=0-->p1   i=1-->p2  i=2-->p3  i=3-->p1
			if(i>=51) {
				dp.add(card);
			}else {
				if(i%3==0) {
					p1.add(card);
				}else if(i%3==1) {
					p2.add(card);
				}else {
					p3.add(card);
				}
			}
		}
		
		//4.排序
		Collections.sort(p1);
		Collections.sort(p2);
		Collections.sort(p3);
		
		//5.看牌
		lookCards(p1);
		lookCards(p2);
		lookCards(p3);
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(dp);
	}
	public static void lookCards(ArrayList al) {
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"、");
		}
		System.out.println();
	}
}
