package It_05;

import Collection.It_01.Animal;

public class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void playGame() {
		System.out.println("猫捉迷藏");
	}
}
