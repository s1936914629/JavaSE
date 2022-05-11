package Args.It_02;

public class Demo {
	public static void main(String[] args) {
		//创建操作类对象，并调用方法
		Operator o = new Operator();
		Anima a = new Cat();
		o.setAnima(a);
		
		Anima a2 = o.getAnima();   //new Cat()
		a2.eat();
		
		
		
		
	}
}
