package It_05;

import Collection.It_01.Animal;

public class Demo {
	public static void main(String[] args) {
		//向上转型
		Animal a = new Cat();
		a.eat();
		
		//向下转型
		Cat c = (Cat) a;
		c.eat();
		c.playGame();
		
		//向上转型
		a = new Dog();
		a.eat();
		
		//向下转型
		//ClassCastException 类型转换异常
		//内存中的地址已经改变
		Cat cc = (Cat) a;
		cc.eat();
		cc.playGame();
	}
}
