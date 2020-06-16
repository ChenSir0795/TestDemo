package 内中类;

public class Outer1 {

//	public void method() {
//		new Inter() {
//		public void show() {
//			System.out.println("匿名内部类");
//		}
//		};
//	}
	Inter i=new Inter() {
		public void show() {
			System.out.println("匿名内部类");
		}
	};

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("匿名内部类");
	}

}

