package It_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：
        把ArrayList集合中的学生数据写入到文本文件。要求：每一个学生对象的数据作为文件中的一行数据
        格式：学号,姓名,年龄,居住地	举例：it001,林青霞,30,西安

    思路：
        1:定义学生类
        2:创建ArrayList集合
        3:创建学生对象
        4:把学生对象添加到集合中
        5:创建字符缓冲输出流对象
        6:遍历集合，得到每一个学生对象
        7:把学生对象的数据拼接成指定格式的字符串
        8:调用字符缓冲输出流对象的方法写数据
        9:释放资源
 */
public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		// 创建ArrayList集合
		ArrayList<Student> array = new ArrayList<Student>();
		
		// 创建学生对象
		Student stu1 = new Student("it001","小红",28,"西安");
		Student stu2 = new Student("it002", "小李", 35, "武汉");
		Student stu3 = new Student("it003", "小张", 33, "郑州");
		
		// 把学生对象添加到集合中
		array.add(stu1);
		array.add(stu2);
		array.add(stu3);
		
		// 创建字符缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("13_CharStream\\Students.txt"));
		
		// 遍历集合，得到每一个学生对象
		for(Student s:array){
			//把学生对象的数据拼接成指定格式的字符串
			StringBuilder sb = new StringBuilder();
			sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			
			//调用字符缓冲输出流对象的方法写数据
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		
		// 释放资源
		bw.close();
	}
}
