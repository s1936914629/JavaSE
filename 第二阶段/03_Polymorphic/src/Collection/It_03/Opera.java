package Collection.It_03;

// 动物操作类
public class Opera {
	/*
	public void useAnimal(Cat c){
		c.eat();
	}
	
	public void useAnimal(Dog d){
		d.eat();
		d.lookDoor();
	}
	
	public void useAnimal(Pig p){
		p.eat();
	}
	*/
	
	public void useAnimal(Animal a) {
		// Animal a = new Cat();  // 错误写法
		a.eat();
		// a.lookDoor();   // 不能调用子类方法
	}
}
