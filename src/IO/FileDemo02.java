package IO;

import java.io.File;

public class FileDemo02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1=new File("F:\\java1\\java.txt");
		System.out.println(f1.createNewFile());
		System.out.println("---------");
		File f2=new File("F:\\java1\\JavaSE");
		System.out.println(f2.mkdir());
		System.out.println("---------");
		//创建多级目录mkdirs;
		File f3=new File("F:\\java1\\hello1\\JavaSE");
		System.out.println(f3.mkdirs());
		File f4=new File("F:\\java1\\jav.txt");
	//	System.out.println(f4.mkdir());
		System.out.println(f4.createNewFile());
	}

}
