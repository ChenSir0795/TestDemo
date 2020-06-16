package √∞≈›∑®≈≈–Ú;
import java.util.Arrays;

public class ArrayDeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,2,4,535,64};
		System.out.println("≈≈–Ú«∞£∫"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("≈≈–Ú∫Û£∫"+Arrays.toString(arr));
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

