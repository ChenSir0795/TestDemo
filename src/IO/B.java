
package IO;

import java.io.FileOutputStream;

public class B {
	public static void main(String[] args) throws Exception{
		FileOutputStream f=new FileOutputStream("E://cf1.txt");
		String s="�������ְҵ������ѧB190107";
		byte[] b=s.getBytes();
//		for(int i=0;i<b.length;i++) {
//			f.write(b[i]);
//		}
		f.write(b,2,4);
		f.close();
	}	
}
