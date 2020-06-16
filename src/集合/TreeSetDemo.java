package 集合;

import java.util.TreeSet;

/*
 * TreeSet集合特点
 * 1：元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则排序
 * TreeSet():根据其元素的自然排序进行排序
 * 2：没有带索引的方法，所以不能用普通for循环遍历
 * 3：由于是Set集合，所以不包含重复的元素集合
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		for(Integer i:ts) {
			System.out.println(i);
		}
	}

}
