package IO;

import java.io.File;

public class FileDemo04 {
public static void main(String[] args) {
	File srcFile=new File("F:\\java1");
	//
	getAllFilepath(srcFile);
}
public static void getAllFilepath(File srcFile) {
	File[] fileArray=srcFile.listFiles();//��ȡ����FileĿ¼�µ��ļ�����Ŀ¼File����
	if(fileArray!=null) {
		for(File file:fileArray) {
			if(file.isDirectory()) {
				//�жϸ�File�����Ƿ���Ŀ¼
				getAllFilepath(file);
			}else {
				System.out.println(file.getAbsolutePath());
			}
		}
	}
}
}
