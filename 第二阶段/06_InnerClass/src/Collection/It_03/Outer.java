package Collection.It_03;

public class Outer {
	private int num = 12;
	
	public void method(){
		int num2=4;
		class Inner{
			public void show(){
				System.out.println(num);
				System.out.println(num2);
			}
		}
		
		Inner i = new Inner();
		i.show();
	}
}
