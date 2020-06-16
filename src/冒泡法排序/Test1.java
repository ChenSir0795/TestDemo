package 冒泡法排序;

public class Test1 {
	public static void main(String[] args) {
		int[] arr= {3,1,6,2,9,0,7,4,5,8};
		System.out.println("排序前："+arrayToStrin(arr));
		for(int x=0;x<arr.length-1;x++) {
			for(int i=0;i<arr.length-1-x;i++) {
				if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}
			}
		}
		System.out.println("排序后："+arrayToStrin(arr));
	}

	private static String arrayToStrin(int[] arr) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(",");
			}
		}
		sb.append("]");
		String s=sb.toString();
		return s;
	}
}
////StringBuilder的主要StringBuilder是append和insert方法，它们是重载的，以便接受任何类型的数据。
//每个都有效地将给定的数据转换为字符串，然后将该字符串的字符附加或插入字符串构建器。
//append方法始终在构建器的末尾添加这些字符; insert方法将insert添加到指定点。 

