package Collection.It_02;

public interface Inter {
	public int num = 10;
	public final int num2 = 20;
	// public static final int num3 = 30;
	int num3 = 30;
	
	// 接口没有构造方法
	// public Inter(){}
	
	// public void show(){}
	
	public abstract void method();
	void show();
	/*
	成员方法
			只能是抽象方法
	默认修饰符：public abstract
	 */
}
