package myClass.ithemia_04;

/*
    学生测试类
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建对象
		Student s = new Student();
		
		//使用set方法给成员变量赋值
		s.setName("小李");
		s.setAge(24);
		
		//调用show方法
		s.show();
	}
}
