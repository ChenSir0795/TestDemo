package IO;

import java.io.File;

public class FileDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("F:\\java1\\java.txt");
		System.out.println(f.isDirectory());//测试此抽象路径表示的File是否为目录
		System.out.println(f.isFile());//测试此抽象路径表示的File是否为文件
		System.out.println(f.exists());//测试此抽象路径表示的File是否存在
		System.out.println(f.getAbsolutePath());//返回抽象路径名的绝对路径名字串符
		System.out.println(f.getPath());//将此抽象路径名转换为路径名字串符
		System.out.println(f.getName());//返回由此路径名表示的文件或目录的名称
		File f2=new File("F:\\java1");
		String[] strArray=f2.list();
		for(String str:strArray) {
			System.out.println(str);
		}
	}

}
