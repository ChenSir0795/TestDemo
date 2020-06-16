package IO;

import java.io.File;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("F:\\java1");
		if(file.exists()) {
			System.out.println(file.delete());
		}
	}

}
