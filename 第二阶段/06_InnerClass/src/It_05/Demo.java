package It_05;

public class Demo {
	public static void main(String[] args) {
		//需求：创建接口操作类的对象，调用method方法
		JumpOpern jo = new JumpOpern();
		Jump c = new Cat();
		jo.method(c);
		
		Jump d = new Dog();
		jo.method(d);
		System.out.println("------------");
		
		jo.method(new Jump() {
			@Override
			public void jump() {
				System.out.println("猪跳高");
			}
		});
		jo.method(new Jump(){
			@Override
			public void jump() {
				System.out.println("猴子可以跳高");
			}
		});
	}
}
