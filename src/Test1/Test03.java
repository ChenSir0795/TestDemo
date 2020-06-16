package Test1;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.print("Enter a:");

        int a=input.nextInt();

        System.out.print("Enter b:");

        int b=input.nextInt();

        System.out.print("Enter c:"); 

        int c=input.nextInt();
        
        int[] nums=new int[]{a,b,c};
        
        Arrays.sort(nums);
        
        for(int i=nums.length-1;i>=0;i--) {
        	System.out.print(nums[i]+" ");
        }
//        int max=0;
//        int mid=0;
//        
//        if(a>b&&a>c) {
//        	max=a;
//        }else if(b>c&&b>a) {
//        	max=b;
//        }else {
//        	max=c;
//        }
//        if(a<c&&a<b) {
//        	min=a;
//        	
//        }
//        
//      
    }

}



