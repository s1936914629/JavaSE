package itheima_02;

/*
    学生类

    为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
 */
public class Student {
	// 成员变量
	private String name, age;
	
	// 成员方法
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getAge() {
		return age;
	}
	
	// 构造方法
	public Student() {
	}
	
	public Student(String name, String age) {
		this.name = name;
		this.age = age;
	}
}
