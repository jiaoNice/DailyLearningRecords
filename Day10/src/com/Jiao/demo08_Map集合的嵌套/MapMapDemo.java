package com.Jiao.demo08_Map���ϵ�Ƕ��;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * 
 */
public class MapMapDemo {
	public static void main(String[] args) {
		//uiMap
		Map<String,String> uiMap = new LinkedHashMap<String,String>();
		uiMap.put("1544", "tom");
		uiMap.put("1543","jerry");
		uiMap.put("1542", "dedy");
		//javaMap
		Map<String,String> javaMap = new LinkedHashMap<String,String>();
		javaMap.put("1544", "tom");
		javaMap.put("1543", "tomy");
		javaMap.put("1542", "vivi");
		//phpMap
		Map<String,String> phpMap = new LinkedHashMap<String,String>();
		phpMap.put("1544", "tom");
		phpMap.put("1543", "rose");
		phpMap.put("1542", "toem");
		//MapǶ��
		Map<String,Map<String,String>> all = new LinkedHashMap<String,Map<String,String>>();
		all.put("UI", uiMap);
		all.put("Java", javaMap);
		all.put("PHP", phpMap);
		//1.keySet   2.entrySet
		Set<Map.Entry<String,Map<String,String>>> set = all.entrySet();
		for(Map.Entry<String,Map<String,String>> en:set) {
			String k = en.getKey();
			Map<String,String> v = en.getValue();
			Set<String> ids = v.keySet();
			//����  1.������   2.foreach
			/*for(String id:ids) {
				String name = v.get(id);
				System.out.println(k+"�γ̰��ѧ����"+id+"��"+name);
			}*/
			//������Iterator
			Iterator<String> it = ids.iterator();
			while(it.hasNext()) {
				String id = it.next();
				String name = v.get(id);
				System.out.println(k+"�γ̰��ѧ����"+id+"��"+name);
			}
		}
	}
	
}
