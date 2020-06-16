package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("张无忌", "赵敏");
		map.put("郭靖", "黄蓉");
		map.put("杨过", "小龙女");
		//获取所有键的集合。用keySet()方法实现
		Set<String> keySet=map.keySet();
		//遍历键的集合，获取到没一个键。用增强for实现
	/*	for(String key:keySet) {
			String value=map.get(key);
			System.out.println(key+","+value);
			
		}
		*/
		Set<Map.Entry<String, String>> entrySet=map.entrySet();
		for(Map.Entry<String,String> me:entrySet) {
			String key=me.getKey();
			String value=me.getKey();
			System.out.println(key+","+value);
		}
	}

}
