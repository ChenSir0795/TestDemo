package ����;

import java.util.Calendar;

public class CalendarDeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calendar c=Calendar.getInstance();
//		int year=c.get(Calendar.YEAR);
//		int month=c.get(Calendar.MONTH)+1;
//		int date=c.get(Calendar.DATE);
//		System.out.println(year+"��"+month+"��"+date+"��");
		//c.add(Calendar.YEAR,-3);
		//Calendar c=Calendar.getInstance();
//		int year=c.get(Calendar.YEAR);
//		int month=c.get(Calendar.MONTH)+1;
//		int date=c.get(Calendar.DATE);
//		System.out.println(year+"��"+month+"��"+date+"��");
		c.set(2020,3,8);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int date=c.get(Calendar.DATE);
		System.out.println(year+"��"+month+"��"+date+"��");
	}

}
