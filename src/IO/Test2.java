package IO;

import java.io.File;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("src/IO/A.txt");
		System.out.println("�ļ����ƣ�"+file.getName());
		System.out.println("�ļ������·����"+file.getPath());
		System.out.println("�ļ��ľ���·����"+file.getAbsolutePath());
		System.out.println("�ļ���·����"+file.getParent());
		System.out.println(file.canRead()?"�ļ��ɶ�":"�ļ����ɶ�");
		System.out.println(file.canWrite()?"�ļ��ɶ�":"�ļ����ɶ�");
		System.out.println(file.isFile()?"��һ���ļ�":"����һ���ļ�");
		System.out.println(file.isFile()?"��һ��Ŀ¼":"����һ��Ŀ¼");
		System.out.println(file.isAbsolute()?"�Ǿ���·��":"���Ǿ���·��");
		System.out.println("����޸�ʱ��Ϊ��"+file.lastModified());
		System.out.println("�ļ���СΪ��"+file.length()+"bytes");
		System.out.println("�Ƿ�ɾ���ļ���"+file.delete());
	}

}
