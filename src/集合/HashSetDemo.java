package 集合;

import java.util.HashSet;

public class HashSetDemo {
/*
 * HashSet集合特点
 * 1:底层数据结构是哈希表
 * 2：对集合的迭代顺序不作任何保证，也就是说不保证存储和取出的元素顺序一致
 * 3：没有带索引的方法，所以不能使用平普通的for循环遍历
 * 4：由于是Set集合，所以是不包含重复元素的集合
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		for(String s:hs) {
			System.out.println(s);
		}
		
	}

}
