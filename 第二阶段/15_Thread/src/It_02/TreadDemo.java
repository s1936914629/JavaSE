package It_02;

/*
    Thread类中获取和设置线程名称的方法
        void setName(String name)：将此线程的名称更改为等于参数 name
        String getName()：返回此线程的名称
 */
public class TreadDemo {
	public static void main(String[] args) {
		// ThreadDaemon mt1 = new ThreadDaemon();
		// ThreadDaemon mt2 = new ThreadDaemon();
		
		/*
		//void setName(String name)：将此线程的名称更改为等于参数 name
		mt1.setName("飞机");
		mt2.setName("高铁");
		
		 */
		
		MyTread mt1 = new MyTread("飞机");
		MyTread mt2 = new MyTread("高铁");
		
		mt1.start();
		mt2.start();
	}
}
