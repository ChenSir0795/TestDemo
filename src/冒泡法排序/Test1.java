package ð�ݷ�����;

public class Test1 {
	public static void main(String[] args) {
		int[] arr= {3,1,6,2,9,0,7,4,5,8};
		System.out.println("����ǰ��"+arrayToStrin(arr));
		for(int x=0;x<arr.length-1;x++) {
			for(int i=0;i<arr.length-1-x;i++) {
				if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}
			}
		}
		System.out.println("�����"+arrayToStrin(arr));
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
////StringBuilder����ҪStringBuilder��append��insert���������������صģ��Ա�����κ����͵����ݡ�
//ÿ������Ч�ؽ�����������ת��Ϊ�ַ�����Ȼ�󽫸��ַ������ַ����ӻ�����ַ�����������
//append����ʼ���ڹ�������ĩβ�����Щ�ַ�; insert������insert��ӵ�ָ���㡣 

