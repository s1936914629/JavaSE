package It_09;

public class Demo {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("小红");
		stu.setAge(12);
		System.out.println(stu.getName()+","+stu.getAge());
		stu.study();
		
		Student stu1=new Student("小李",25);
		System.out.println(stu1.getName()+","+stu1.getAge());
		stu1.study();
		
		Teacher t1 = new Teacher();
		t1.setName("林青霞");
		t1.setAge(30);
		System.out.println(t1.getName() + "," + t1.getAge());
		t1.teach();
		
		Teacher t2 = new Teacher("风清扬", 33);
		System.out.println(t2.getName() + "," + t2.getAge());
		t2.teach();
	}
}
