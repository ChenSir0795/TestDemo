package 接口;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
//set集合特点
//不包含重复索引的方法，
//没带索引的方法，所以不能使用普通for循环遍历
	//HashSet：对集合的迭代顺序不作任何保证
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("java");
		for(String s:set) {
			System.out.println(s);
		}
	}

}
