package Generic.It_04;

public class Demo {
	public static void main(String[] args) {
		Generic<String> g1 = new GenericImpl<String>();
		g1.show("小李");
		
		Generic<Integer> g2 = new GenericImpl<Integer>();
		g2.show(21);
		
	}
}
