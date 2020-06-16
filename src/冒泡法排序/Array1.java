package 冒泡法排序;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数据");
		String s=sc.nextLine();
		String[] arr=s.split(",");
		int[] Arr=new int[arr.length];
		//int[] arr={1,2,3,4,5,6,7,8,9,10};
		for(int x=0;x<arr.length;x++) {
			Arr[x]= Integer.parseInt(arr[x]);;
		}
		System.out.println("原数组：");
		for(int x=0;x<Arr.length;x++) {
			System.out.print(Arr[x]+" ");
		}
		System.out.println();
		
		int tmp=Arr[Arr.length-1];
		for(int x=Arr.length-1;x>0;x--) {
			Arr[x]=Arr[x-1];
		}
		Arr[0]=tmp;
		System.out.println("后移后的数组：");
		for(int x=0;x<Arr.length;x++) {
			System.out.print(Arr[x]+" ");
		}
	}

}
