package Map.It_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历

    思路：
        1:定义学生类
        2:创建HashMap集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
            方式1：键找值
            方式2：键值对对象找键和值
 */
public class Demo {
	public static void main(String[] args) {
		//创建HashMap集合对象
		HashMap<String, Student> hm = new HashMap<String, Student>();
		
		//创建学生对象
		Student stu1 = new Student("小红", 21);
		Student stu2 = new Student("小米", 20);
		Student stu3 = new Student("小玉", 18);
		
		//把学生添加到集合
		hm.put("it01", stu1);
		hm.put("it02", stu2);
		hm.put("it03", stu3);
		
		//方式1：键找值
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			Student value = hm.get(key);
			System.out.println(key + ":" + value.getName() + "," + value.getAge());
		}
		
		System.out.println("------------");
		
		//方式2：键值对对象找键和值
		Set<Map.Entry<String, Student>> entries = hm.entrySet();
		for(Map.Entry<String, Student> me:entries){
			String key = me.getKey();
			Student value = me.getValue();
			System.out.println(key + ":" + value.getName() + "," + value.getAge());
		}
	}
	
}
