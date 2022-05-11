package Args.It_03;

public class Operator {
	public void setJump(Jump j ){  //Jump j = new Cat();
		j.jump();
	}
	
	public Jump getJump(){
		Jump j = new Cat();
		return j;
	}
}
