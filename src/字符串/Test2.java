package �ַ���;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String checkStr = null;
		System.out.println("������Ҫ�����ַ�����");
		Scanner in = new Scanner(System.in);
		checkStr = in.nextLine(); 		
		if (isPaildrome(checkStr)) { 		
			System.out.println(checkStr + "�ǻ��Ĵ���");
		} else {
			System.out.println(checkStr + "���ǻ��Ĵ���");
		}
	}
	private static boolean isPaildrome(String check) {
		int low = 0; 				
		int high = check.length() - 1; 		
		while (low < high) {
			if (check.charAt(low) != check.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}

	}


