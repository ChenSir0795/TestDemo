package ����;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListcludeHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String,String>> array=new ArrayList<HashMap<String,String>>();
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("���", "����");
		hm1.put("���", "С��");
		array.add(hm1);
		HashMap<String,String> hm2=new HashMap<String,String>();
		hm1.put("����", "����");
		hm1.put("���", "С��Ů");
		array.add(hm2);
		HashMap<String,String> hm3=new HashMap<String,String>();
		hm1.put("�����", "��ӯӯ");
		hm1.put("��ƽ֮", "����ɺ");
		array.add(hm3);
		for(HashMap<String,String> hm: array) {
			Set<String> keySet=hm.keySet();
			for(String key:keySet) {
				String value=hm.get(key);
				System.out.println(key+","+value);
			}
		}
	}

}
