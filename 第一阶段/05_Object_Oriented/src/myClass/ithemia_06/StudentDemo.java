package myClass.ithemia_06;
/*
    创建对象并为其成员变量赋值的两种方式
        1:无参构造方法创建对象后使用setXxx()赋值
        2:使用带参构造方法直接创建带有属性值的对象
*/
public class StudentDemo {
	public static void main(String[] args) {
		// 无参构造方法创建对象后使用setXxx()赋值
		Student s1 = new Student();
		s1.setName("小玉");
		s1.setAge(21);
		// s1.show();
		System.out.println(s1.getName()+"---"+s1.getAge());
		//get方法要有接收变量接受
		// String sting=s1.getName();
		// int aa = s1.getAge();
		// System.out.println(sting+","+aa);
		
		
		// 使用带参构造方法直接创建带有属性值的对象
		Student s2 = new Student("小张",23);
		s2.show();
		
	}
}
