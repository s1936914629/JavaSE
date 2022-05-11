package Date.It_02;

import java.util.Date;

/*
    public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
    public void setTime(long time):设置时间，给的是毫秒值
 */
public class Demo {
	public static void main(String[] args) {
		// public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
		Date d = new Date();
		long l = d.getTime();
		System.out.println(l);
		l = d.getTime()/1000/60/60/24/365;
		System.out.println(l);
		
		//public void setTime(long time):设置时间，给的是毫秒值
		// long time = 1000*60*60;
		long time = System.currentTimeMillis(); //给定标准时间1970年1月1日
		d.setTime(time); //返回现在时间
		System.out.println(d);
	}
}
