package ����;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>map=new HashMap<String,String>();
		map.put("���޼�", "����");
		map.put("����", "����");
		map.put("���", "С��Ů");
		Set<String> keySet=map.keySet();
		for(String key:keySet) {
			String value=map.get(key);
			System.out.println(key+","+value);
		}
	}

}
