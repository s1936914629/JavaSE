package It_04;

public class Demo {
	public static void main(String[] args) {
		//创建对象，按照多态的方式
		Animal a = new Cat();
		a.setName("布偶");
		a.setAge(2);
		System.out.println();
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		System.out.println("--------");
		
		a = new Cat("英短",3);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		System.out.println("--------");
		
		Animal a1= new Dog();
		a1.setName("边牧");
		a1.setAge(3);
		System.out.println(a1.getName()+","+a1.getAge());
		a1.eat();
		System.out.println("--------");
		
		a1 = new Dog("金毛",5);
		System.out.println(a1.getName()+","+a1.getAge());
		a1.eat();
	}
	
}
