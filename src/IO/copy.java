package IO;

import java.io.*;

public class copy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream in=new FileInputStream("E:\\a\\A.mp3");
		OutputStream out=new FileOutputStream("E:\\b\\A.mp3");
		int len;
		long begintime=System.currentTimeMillis();
		while((len=in.read())!=-1) {
			out.write(len);
		}
		long endtime=System.currentTimeMillis();
		System.out.println("�����ļ������ĵ�ʱ�䣺"+(endtime-begintime));
		in.close();
		out.close();
				
	}

}
