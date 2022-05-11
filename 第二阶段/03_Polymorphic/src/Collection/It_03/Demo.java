package Collection.It_03;

public class Demo {
	public static void main(String[] args) {
		//创建动物操作类的对象，调用方法
		Opera o= new Opera();
		
		Cat c= new Cat();
		o.useAnimal(c);
		
		Dog d=new Dog();
		o.useAnimal(d);
		
		Pig p=new Pig();
		o.useAnimal(p);
		
	}
}
