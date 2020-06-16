package Test2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一串字符串");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		int nums=0;
		int letter=0;
		int space=0;
		int other=0;
		char[] Arr=string.toCharArray();
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]>=48&&Arr[i]<=57) {
				nums++;
			}
			else if((Arr[i]>=65&&Arr[i]<=90)||(Arr[i]>=97&&Arr[i]<=122)) {
				letter++;
			}
			else if(Arr[i]==32) {
				space++;
			}
			else {
				other++;
			}
		}
		System.out.println("数字有："+nums+","+"字母有："+letter+","+"空格有："+space+","+"其他有："+other);
	}

}
