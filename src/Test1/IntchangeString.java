package Test1;

public class IntchangeString {
public static void main(String[] args) {
	String s="91 27 46 38 50";
	//���ַ��������ݴ��浽һ��int����������
	String[] strArray=s.split(" ");
//	for(int i=0;i<strArray.length;i++) {
//		System.out.println(strArray[i]);
//	}
	//����һ��int���飬��String[]�����е�ÿһ��Ԫ�ش��浽int������
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
