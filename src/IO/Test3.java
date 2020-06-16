package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.io.*;
public class Test3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file=new File("F:\\java1");
		if(file.isDirectory()) {
			String[] names=file.list();
			for(String name:names) {
				System.out.println(name);
			}
		}
//		File file=new File("F:\\java1");
//		FilenameFilter filter=new FilenameFilter() {
//
//			@Override
//			public boolean accept(File dir, String name) {
//				File currFile=new File(dir,name);
//				if(currFile.isFile()&&name.endsWith(".java")) {
//				return true;
//				
//			    }else {
//				return false;
//			}
//			
//		}
//	};
//	if(file.exists()) {
//		String[] lists=file.list(filter);
//		for(String name:lists) {
//			System.out.println(name);
//		}
//	}
	}
}


