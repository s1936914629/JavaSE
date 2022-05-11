package TreeSet.It_03;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：
        用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
        要求：按照总分从高到低出现

    思路：
        1:定义学生类
        2:创建TreeSet集合对象，通过比较器排序进行排序
        3:创建学生对象
        4:把学生对象添加到集合
        5:遍历集合
 */
public class Demo {
	public static void main(String[] args) {
		//创建TreeSet集合对象，通过比较器排序进行排序
		TreeSet<Student> ts = new TreeSet<Student>(
				new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						// int num = (s2.getChinese()+s2.getMath()-(s1.getMath()+s1.getChinese()));
						//主要条件
						int num = s2.getSum() - s1.getSum();
						//次要条件
						int num2 = num == 0?s1.getChinese()-s2.getChinese():num;
						int num3 = num2 == 0?s1.getName().compareTo(s2.getName()):num2;
						return num3;
					}
				}
		);
		
		//创建学生对象
		Student stu1 = new Student("小红",98,99);
		Student stu2 = new Student("小明",98,100);
		Student stu3 = new Student("小玉",97,98);
		Student stu4 = new Student("小张",96,96);
		Student stu5 = new Student("小李",99,93);
		Student stu6 = new Student("小王",99,99);
		
		//把学生对象添加到集合
		ts.add(stu1);
		ts.add(stu2);
		ts.add(stu3);
		ts.add(stu4);
		ts.add(stu5);
		ts.add(stu6);
		
		//遍历集合
		for(Student stu:ts){
			System.out.println(stu.getName()+","+stu.getChinese()+","+stu.getMath()+","+stu.getSum());
		}
	}
}
