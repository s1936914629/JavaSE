package It_06;

public class Demo {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call("小李");
		System.out.println("----------");
		
		NewPhone p1 = new NewPhone();
		p1.call("小红");
	}
}
