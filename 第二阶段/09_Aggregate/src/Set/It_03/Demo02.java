package Set.It_03;

import java.util.HashSet;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        要求：学生对象的成员变量值相同，我们就认为是同一个对象

    思路：
        1:定义学生类
        2:创建HashSet集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(增强for)
 */
public class Demo02 {
	public static void main(String[] args) {
		//创建HashSet集合对象
		HashSet<Student> hs = new HashSet<Student>();
		
		//创建学生对象
		Student stu1 = new Student("小李",21);
		Student stu2 = new Student("小红",18);
		Student stu3 = new Student("小张",25);
		
		Student stu4 = new Student("小红",18);
		
		//把学生添加到集合
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		hs.add(stu4);
		
		//遍历集合(增强for)
		for(Student stu:hs){
			System.out.println(stu.getName() + "," + stu.getAge());
		}
	}
}
