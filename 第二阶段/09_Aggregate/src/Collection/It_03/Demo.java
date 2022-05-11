package Collection.It_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建Collection集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(迭代器方式)
 */
public class Demo {
	public static void main(String[] args) {
		//创建Collection集合对象
		Collection<Student> c = new ArrayList<Student>();
		
		//创建学生对象
		Student stu1 = new Student("小红",17);
		Student stu2 = new Student("小明",18);
		Student stu3 = new Student("小张",20);
		
		//把学生添加到集合
		c.add(stu1);
		c.add(stu2);
		c.add(stu3);
		
		//遍历集合(迭代器方式)
		Iterator<Student> it = c.iterator();
		while (it.hasNext()){
			Student stu = it.next();
			// System.out.println(stu.getName()+","+stu.getAge());
			System.out.println(stu);
		}
		
	}
}
