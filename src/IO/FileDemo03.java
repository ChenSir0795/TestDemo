package IO;

import java.io.File;

public class FileDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("F:\\java1\\java.txt");
		System.out.println(f.isDirectory());//���Դ˳���·����ʾ��File�Ƿ�ΪĿ¼
		System.out.println(f.isFile());//���Դ˳���·����ʾ��File�Ƿ�Ϊ�ļ�
		System.out.println(f.exists());//���Դ˳���·����ʾ��File�Ƿ����
		System.out.println(f.getAbsolutePath());//���س���·�����ľ���·�����ִ���
		System.out.println(f.getPath());//���˳���·����ת��Ϊ·�����ִ���
		System.out.println(f.getName());//�����ɴ�·������ʾ���ļ���Ŀ¼������
		File f2=new File("F:\\java1");
		String[] strArray=f2.list();
		for(String str:strArray) {
			System.out.println(str);
		}
	}

}
