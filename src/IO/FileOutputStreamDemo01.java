package IO;

import java.io.*;


public class FileOutputStreamDemo01 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("F:\\fos.txt");
		fos.write(97);
		fos.close();
	}

}
