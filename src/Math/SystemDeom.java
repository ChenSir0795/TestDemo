package Math;

public class SystemDeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public static long currentTimemills();返回当前时间（一毫秒为单位）
		//System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");
		long start =System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			System.out.println(i);
		}
		long end=System.currentTimeMillis();
		System.out.println("共耗时"+(end-start)+"秒");
	}

}
