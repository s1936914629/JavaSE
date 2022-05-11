package itheima_02;

import java.util.ArrayList;
import java.util.Scanner;

/*
    需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
         学生的姓名和年龄来自于键盘录入

    思路：
        1:定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
        2:创建集合对象
        3:键盘录入学生对象所需要的数据
        4:创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        5:往集合中添加学生对象
        6:遍历集合，采用通用遍历格式实现
 */
public class ArrayLIstTest {
	public static void main(String[] args) {
		
		// 创建集合对象
		ArrayList<Student> stu = new ArrayList<>();
		
		/*
		// 键盘录入学生对象所需要的数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入名字：");
		String name= sc.nextLine();
		System.out.println("请输入年龄：");
		String age = sc.nextLine();

		// 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
		
		// Student stu1=new Student(name,age);
		// Student stu2=new Student(name,age);
		// Student stu3=new Student(name,age);
		// 不能这么写，键盘录入得到数据都存在stu1中
		
		Student s =new Student();
		s.setName(name);
		s.setAge(age);

		// 往集合中添加学生对象
		stu.add(s);
		*/
		
		// 为了提高代码的复用性，用方法来改进程序
		addStudent(stu);
		addStudent(stu);
		addStudent(stu);
		
		// 遍历集合，采用通用遍历格式实现
		for (int i = 0; i < stu.size(); i++) {
			Student stun = stu.get(i);
			System.out.println(stun.getName() + ", " + stun.getAge());
		}
	}
	
	// 键盘录入集合信息
	/*
	 * 返回值类型：void
	 * 参数：ArrayList<Student> stu
	 * */
	public static void addStudent(ArrayList<Student> stu) {
		// 键盘录入学生对象所需要的数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入名字：");
		String name = sc.nextLine();
		System.out.println("请输入年龄：");
		String age = sc.nextLine();
		
		// 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		// 往集合中添加学生对象
		stu.add(s);
	}
	
}
