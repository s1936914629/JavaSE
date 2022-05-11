package Args.It_01;

public class Demo {
	public static void main(String[] args) {
		//创建操作类对象，并调用方法
		Operator o= new Operator();
		Cat c= new Cat();
		o.useCat(c);
		
		Cat c2=o.getCat();  //new Cat()
		c2.eat();
	}
}
