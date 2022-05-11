package Date.It_01;

import java.util.Date;

/*
    public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
    public Date(long date)：分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
 */
public class Demo {
	public static void main(String[] args) {
		//public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
		Date d = new Date();  //显示当前时间
		System.out.println(d);
		
		//public Date(long date)：分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
		long l = 1000;
		Date d1 =new Date(l);  // l为毫秒数
		System.out.println(d1);
	}
}
