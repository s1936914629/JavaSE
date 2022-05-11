package Collection.It_02;
/*
成员访问特点:
	成员变量
		编译看父类，运行看父类
	成员方法
		编译看父类，运行看子类
* */
public class Demo {
	public static void main(String[] args) {
		//有父类引用指向子类对象
		Animal a=new Cat();
		
		System.out.println(a.age);
		// System.out.println(a.weight);
		
		a.eat();
		// a.playGame();
	}
}
