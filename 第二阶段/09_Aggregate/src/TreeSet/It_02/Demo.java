package TreeSet.It_02;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		//创建集合对象
		TreeSet<Student> ts = new TreeSet<Student>(
				new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						//this.age - s.age
						//s1,s2
						int num = s1.getAge() - s2.getAge();
						int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
						return num2;
					}
				}
		);
		
		//创建学生对象
		Student stu1 = new Student("张三",21);
		Student stu2 = new Student("李四",25);
		Student stu3 = new Student("王五",27);
		Student stu4 = new Student("小明",22);
		
		Student stu5 = new Student("小红",27);
		Student stu6 = new Student("小红",27);
		
		//把学生添加到集合
		ts.add(stu1);
		ts.add(stu2);
		ts.add(stu3);
		ts.add(stu4);
		ts.add(stu5);
		ts.add(stu6);
		
		for(Student stu:ts){
			System.out.println(stu.getName()+","+stu.getAge());
		}
	}
	
}
