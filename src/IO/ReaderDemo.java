package IO;

import java.io.*;

public class ReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("E:\\cf.txt");
		int ch;
		while((ch=reader.read())!=-1) {
			System.out.println((char)ch);
		}
		reader.close();
	}

}
