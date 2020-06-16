package ÈÕÆÚ;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	private DateUtils() {}
	public static String dateToString(Date date,String formate) {
		Object format;
		SimpleDateFormat sdf=new SimpleDateFormat();
		String s=sdf.format(date);
		return s;
	}
}
