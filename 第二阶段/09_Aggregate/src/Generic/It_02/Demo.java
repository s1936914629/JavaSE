package Generic.It_02;

public class Demo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("小红");
		System.out.println(s.getName());
		
		Teacher t = new Teacher();
		t.setAge(21);
		// t.setAge("21");
		System.out.println(t.getAge());
		System.out.println("-----------");
		
		Generic<String > g1 = new Generic<String>();
		g1.setT("小玉");
		System.out.println(g1.getT());
		
		Generic<Integer> g2 = new Generic<Integer>();
		g2.setT(20);
		System.out.println(g2.getT());
		Generic<Boolean> g3 = new Generic<Boolean>();
		g3.setT(true);
		System.out.println(g3.getT());
	}
}
