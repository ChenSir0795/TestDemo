package IO;

import java.io.FileWriter;

public class WriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter("E:\\writer.txt");
		String s="�������ְҵ������ѧ";
		writer.write(s);
		writer.write("\r\n");
		writer.close();
	}

}
