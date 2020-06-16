package IO;

import java.io.*;

public class FileOutStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	FileOutputStream fos=new FileOutputStream("F:\\fos.txt");
//	fos.write(97);
//	fos.write(98);
//	fos.write(99);
//	fos.write(100);
//	fos.write(101);
	byte[] bys="abcde".getBytes();
	fos.write(bys);
	}

}
