package Test2;

public class Test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] str= {"abc","cde","bs","hello"};
	for(int i=str.length-1;i>=0;i--) {
		for(int j=0;j<=i-1;j++) {
			if(str[j].compareTo(str[j+1])<0) {
				String temp=str[j];
				str[j]=str[j+1];
				str[j+1]=temp;
			}
		}
		for(String Substr:str) {
			System.out.println(Substr+" ");
		}
	}
	}

}
