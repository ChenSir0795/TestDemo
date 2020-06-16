package IO;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("F:\\C.java");
		
		LineNumberReader lr=new LineNumberReader(fr);
		FileWriter fw=new FileWriter("F:\\C.java");
		lr.setLineNumber(0);
		String line=null;
		while((line=lr.readLine())!=null) {
			fw.write(lr.getLineNumber()+":"+line);
			fw.write("\r\n");
		}
		lr.close();
		fw.close();
	}

}
