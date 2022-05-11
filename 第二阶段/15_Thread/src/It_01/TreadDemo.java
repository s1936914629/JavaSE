package It_01;

/*
    方式1：继承Thread类
        1:定义一个类MyThread继承Thread类
        2:在MyThread类中重写run()方法
        3:创建MyThread类的对象
        4:启动线程
 */
public class TreadDemo {
	public static void main(String[] args) {
		MyTread mt1 = new MyTread();
		MyTread mt2 = new MyTread();
		
		// 启动线程
		// mt1.run();
		// mt2.run();
		
		//void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法
		mt1.start();
		mt2.start();
		
	}
}
