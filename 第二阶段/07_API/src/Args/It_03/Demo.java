package Args.It_03;

public class Demo {
	public static void main(String[] args) {
		//创建操作类对象，并调用方法
		Jump j = new Cat();
		Operator o = new Operator();
		o.setJump(j);
		
		Jump j2 = o.getJump();  //new Cat()
		j2.jump();
	}
}
