package Collection.It_02;

public class Demo {
	public static void main(String[] args) {
		// 接口多态
		Inter i = new InterImpl();
		// i.num=20;
		System.out.println(i.num);
		// i.num2 = 40;
		System.out.println(i.num2);
		System.out.println(Inter.num);
	}
}
