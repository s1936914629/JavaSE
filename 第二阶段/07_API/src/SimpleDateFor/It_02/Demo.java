package SimpleDateFor.It_02;

import java.text.ParseException;
import java.util.Date;

public class Demo {
	public static void main(String[] args) throws ParseException {
		//创建日期对象
		Date d = new Date();
		
		String  s1 = DateUtils.dateToString(d,"yyyy年MM月dd日 HH:mm:ss");
		System.out.println(s1);
		System.out.println("---------");
		
		String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
		System.out.println(s2);
		System.out.println("---------");
		
		String s3 = DateUtils.dateToString(d, "HH:mm:ss");
		System.out.println(s3);
		System.out.println("---------");
		
		String s = "2021-01-08 03:05:45";
		Date dd = DateUtils.StringToDate(s,"yyyy-MM-dd HH:mm:ss");
		System.out.println(dd);
	}
}
