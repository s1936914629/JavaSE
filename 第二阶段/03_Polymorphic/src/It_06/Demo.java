package It_06;

public class Demo {
	public static void main(String[] args) {
		//创建猫类对象进行测试
		Animal a = new Cat();
		a.setName("布偶");
		a.setAge(4);
		System.out.println(a.getName() + "," + a.getAge());
		a.eat();
		
		a = new Cat("英短", 3);
		System.out.println(a.getName() + "," + a.getAge());
		a.eat();
		
		//创建狗类对象进行测试
		a = new Dog();
		a.setName("边牧");
		a.setAge(5);
		System.out.println(a.getName() + "," + a.getAge());
		a.eat();
		
		a = new Dog("金毛",2);
		System.out.println(a.getName() + "," + a.getAge());
		a.eat();
		
	}
}
