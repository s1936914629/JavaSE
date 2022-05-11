package Collections.It_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    需求：
        ArrayList存储学生对象，使用Collections对ArrayList进行排序
        要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序

    思路：
        1:定义学生类
        2:创建ArrayList集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:使用Collections对ArrayList集合排序
        6:遍历集合
 */
public class Demo02 {
	public static void main(String[] args) {
		//创建ArrayList集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		//创建学生对象
		Student stu1 = new Student("张三",21);
		Student stu2 = new Student("李四",18);
		Student stu3 = new Student("王五",21);
		Student stu4 = new Student("小玉",21);
		
		//把学生添加到集合
		array.add(stu1);
		array.add(stu2);
		array.add(stu3);
		array.add(stu4);
		
		//使用Collections对ArrayList集合排序
		//sort(List<T> list, Comparator<? super T> c)
		Collections.sort(array, new Comparator<Student>() {
			@Override
			public int compare(Student stu1, Student stu2) {
				//按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
				int num1 = stu1.getAge()-stu2.getAge();
				int num2 = num1 ==0?stu1.getName().compareTo(stu2.getName()):num1;
				return num2;
			}
		});
		
		//遍历集合
		for(Student stu:array){
			System.out.println(stu.getName()+","+stu.getAge());
		}
		
	}
}
