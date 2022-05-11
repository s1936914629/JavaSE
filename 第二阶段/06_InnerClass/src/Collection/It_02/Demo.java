package Collection.It_02;

public class Demo {
	public static void main(String[] args) {
		//创建内部类对象，并调用方法
		// Integer i = new Integer(); // 不能直接实例
		/*
		Outer.Inner oi=new Outer().new Inner();
		oi.show();
		 */
		
		Outer o = new Outer();
		o.method();
		
	}
}
