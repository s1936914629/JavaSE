package It_10;

import It_09.Student;
import It_09.Teacher;

public class Demo {
	public static void main(String[] args) {
		It_09.Teacher t1 = new It_09.Teacher();
		t1.setName("林青霞");
		t1.setAge(30);
		System.out.println(t1.getName() + "," + t1.getAge());
		t1.teach();
		
		It_09.Teacher t2 = new Teacher("风清扬", 33);
		System.out.println(t2.getName() + "," + t2.getAge());
		t2.teach();
		
		It_09.Student stu = new It_09.Student();
		stu.setName("小红");
		stu.setAge(12);
		System.out.println(stu.getName()+","+stu.getAge());
		stu.study();
		
		It_09.Student stu1=new Student("小李",25);
		System.out.println(stu1.getName()+","+stu1.getAge());
		stu1.study();
	}
}
