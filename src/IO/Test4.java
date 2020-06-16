package IO;
import java.io.File;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("F:\\java1");
		fileDir(file);
		
	}
	public static void fileDir(File dir) {
		File[] files=dir.listFiles();
		for(File file:files) {
			if(file.isDirectory()) {
				fileDir(file);
			}
			System.out.println(file.getAbsolutePath());
		}
	}
}
