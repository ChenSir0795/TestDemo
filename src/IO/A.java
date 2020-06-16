package IO;
import java.io.*;
import java.io.FileInputStream;
public class A {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream F = new FileInputStream("E:\\cf.txt");
//		System.out.println(F);
		int b=0;
		while(true) {
			b=F.read();
			
			if(b==-1) {
				break;
			}
			System.out.println(b);
		}
		F.close();
	}

}
