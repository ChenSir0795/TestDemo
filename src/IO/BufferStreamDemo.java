package IO;

import java.io.*;

public class BufferStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("F:\\fos.txt"));
		//һ�ζ�ȡһ���ֽ�����������
//		int by;
//		while((by=bis.read())!=-1) {
//			System.out.print((char)by);
//		}
		//һ�ζ�ȡһ���ֽ���������
		byte[] bys=new byte[10];
		int len;
		while((len=bis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		
		}
	}

}
