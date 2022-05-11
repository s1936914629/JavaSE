package Args.It_01;

public class Operator {
	public void useCat(Cat c){  //Cat c = new Cat();
		c.eat();
	}
	
	public Cat getCat(){
		Cat c = new Cat();
		return c;
	}
}
