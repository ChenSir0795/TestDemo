package Test1;

public class IntchangeString {
public static void main(String[] args) {
	String s="91 27 46 38 50";
	//把字符串的数据储存到一个int类型数组中
	String[] strArray=s.split(" ");
//	for(int i=0;i<strArray.length;i++) {
//		System.out.println(strArray[i]);
//	}
	//定义一个int数组，把String[]数组中的每一个元素储存到int数组中
	int[] arr=new int[strArray.length];
	for(int i=0;i<arr.length;i++) {
		arr[i]=Integer.parseInt(strArray[i]);
	}
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	StringBuilder sb=new StringBuilder();
	sb.append("[");
	for(int i=0;i<arr.length;i++) {
		if(i==arr.length) {
			sb.append(arr[i]);
		}
	
	else {
		sb.append(arr[i]).append(" ");
	}
	}
	sb.append("]");
	String result=sb.toString();
	System.out.println("result"+result);
}
}
