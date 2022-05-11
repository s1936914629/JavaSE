package Collection.It_03;

public class Demo {
	public static void main(String[] args) {
		//创建对象，调用方法
		Jump j = new Cat();
		j.jump();
		System.out.println("-------");
		
		Animal a = new Cat();
		a.setName("布偶");
		a.setAge(4);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		// a.jump();
		System.out.println("--------");
		
		a = new Cat("英短",2);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		System.out.println("--------");
		
		Cat c = new Cat();
		c.setName("加菲");
		c.setAge(5);
		System.out.println(c.getName()+","+c.getAge());
		c.eat();
		c.jump();
	}
}
