package Test1;

import java.util.Date;

public class DateDeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		long Date=1000*60*60;
		Date d2=new Date();
		System.out.println(d2);
		//System.out.println(d.getTime()*1.0/1000/60/60/24/365+"Äê");
		long time=System.currentTimeMillis();
		d.setTime(time);
		System.out.println(d);
	}

}
