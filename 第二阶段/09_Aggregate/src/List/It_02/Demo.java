package List.It_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建List集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(迭代器方式，for循环方式)
 */
public class Demo {
	public static void main(String[] args) {
		// 创建List集合对象
		List<Student> list = new ArrayList<Student>();
		
		//创建学生对象
		Student stu1 = new Student("小红", 18);
		Student stu2 = new Student("小明", 17);
		Student stu3 = new Student("小鱼", 20);
		
		//把学生添加到集合
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		//遍历集合(迭代器方式，for循环方式)
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu.getName() + "," + stu.getAge());
		}
		System.out.println("----------");
		
		for(int i = 0;i<list.size();i++){
			Student stu = list.get(i);
			System.out.println(stu.getName() + "," + stu.getAge());
		}
		
	}
}
