package IO;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("E:\\cf2.txt\\java.txt");
		System.out.println(f1);
		File f2=new File("E:\\cf2.txt","java.txt");
		System.out.println(f2);
		File f3=new File("E:\\cf2.txt");
		File f4=new File(f3,"java.txt");
		System.out.println(f4);
	}

}
