package Test2;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int bite=1;bite<5;bite++) {
			for(int ten=1;ten<5;ten++) {
				for(int hundred=1;hundred<5;hundred++) {
					if(bite!=ten&&bite!=hundred&&ten!=hundred) {
						System.out.print(bite+ten*10+hundred*100+" ");
						count++;
						if(count%10==0) {
						System.out.println();
					}
					}
//					if(count%10==0) {
//						System.out.println();
//					}
				}
			}
		}
		System.out.println("总共有"+count+"个这样的数");
	}

}
