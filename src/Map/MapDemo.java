package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("���޼�", "����");
		map.put("����", "����");
		map.put("���", "С��Ů");
		//��ȡ���м��ļ��ϡ���keySet()����ʵ��
		Set<String> keySet=map.keySet();
		//�������ļ��ϣ���ȡ��ûһ����������ǿforʵ��
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
