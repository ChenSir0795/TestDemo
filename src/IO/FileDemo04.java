package IO;

import java.io.File;

public class FileDemo04 {
public static void main(String[] args) {
	File srcFile=new File("F:\\java1");
	//
	getAllFilepath(srcFile);
}
public static void getAllFilepath(File srcFile) {
	File[] fileArray=srcFile.listFiles();//获取给定File目录下的文件或者目录File数组
	if(fileArray!=null) {
		for(File file:fileArray) {
			if(file.isDirectory()) {
				//判断该File对象是否是目录
				getAllFilepath(file);
			}else {
				System.out.println(file.getAbsolutePath());
			}
		}
	}
}
}
