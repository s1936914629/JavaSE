package itheima_01;

import java.util.ArrayList;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建集合对象
        3:创建学生对象
        4:添加学生对象到集合中
        5:遍历集合，采用通用遍历格式实现
 */
public class ArrayListTest02 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Student> stu = new ArrayList<>();
		
		// 创建学生对象
		Student stu1 = new Student("小红", 15);
		Student stu2 = new Student("小米", 18);
		Student stu3 = new Student("小张", 17);
		
		// 添加学生对象到集合中
		stu.add(stu1);
		stu.add(stu2);
		stu.add(stu3);
		
		// 遍历集合，采用通用遍历格式实现
		for (int i = 0; i < stu.size(); i++) {
			// System.out.println("stu:"+stu.get(i)); // 错误，返回的是地址值
			Student s = stu.get(i);
			System.out.println(s.getName() + ", " + s.getAge());
			
		}
	}
}

