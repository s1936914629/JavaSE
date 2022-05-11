package List.It_08;

import java.util.ArrayList;
import java.util.Iterator;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建ArrayList集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
            迭代器：集合特有的遍历方式
            普通for：带有索引的遍历方式
            增强for：最方便的遍历方式
 */
public class Demo {
	public static void main(String[] args) {
		//创建ArrayList集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		//创建学生对象
		Student stu1 = new Student("小红", 18);
		Student stu2 = new Student("小明", 17);
		Student stu3 = new Student("小鱼", 20);
		
		//把学生添加到集合
		array.add(stu1);
		array.add(stu2);
		array.add(stu3);
		
		//迭代器：集合特有的遍历方式
		Iterator<Student> it = array.iterator();
		while (it.hasNext()){
			Student stu = it.next();
			System.out.println(stu.getName() + "," + stu.getAge());
		}
		System.out.println("--------");
		
		//普通for：带有索引的遍历方式
		for(int i=0;i<array.size();i++){
			Student stu = array.get(i);
			System.out.println(stu.getName() + "," + stu.getAge());
		}
		
		//增强for：最方便的遍历方式
		for(Student stu:array){
			System.out.println(stu.getName() + "," + stu.getAge());
		}
		
	}
}
