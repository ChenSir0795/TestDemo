package �쳣;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {// try����飬���п��ܻ�����쳣
				FileInputStream fis = new FileInputStream("text.txt");
				int b;
				while ((b = fis.read()) != -1) {
					System.out.print(b);	}
				fis.close();
			} catch (FileNotFoundException e) {
				// ����catch��䲶׽FileNotFoundException�쳣������
				// FileNotFoundExceptionΪ�쳣���ͣ�eΪ�쳣����
				System.out.println(e);
				System.out.println("message���쳣��ʾ��: " + e.getMessage());
			} catch (IOException e) {
				// ����catch��䲶׽IOException�쳣������
				System.out.println(e);
			}
			System.out.println("������������");
		}

	

}
