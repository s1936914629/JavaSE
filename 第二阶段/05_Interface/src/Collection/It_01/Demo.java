package Collection.It_01;

public class Demo {
	public static void main(String[] args) {
		// Jump j = new Jump();
		// 接口不能实例化
		
		Jump j = new Cat();
		j.jump();
	}
}
