package TreeSet.It_01;

import java.util.TreeSet;

/*
    存储学生对象并遍历，创建集合使用无参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class Demo02 {
	public static void main(String[] args) {
		//创建集合对象
		TreeSet<Student> ts = new TreeSet<Student>();
		
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
		
		//遍历集合
		for(Student stu: ts){
			System.out.println(stu.getName()+","+stu.getAge());
		}
	}
}
