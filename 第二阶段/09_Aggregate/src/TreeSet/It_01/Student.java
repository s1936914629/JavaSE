package TreeSet.It_01;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student(){}
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	@Override
	public int compareTo(Student s) {
		// return 0;  //只添加一个
		// return 1;  //按照添加顺序正序输出
		// return -1;   //按照添加顺序倒序输出
		
		//按照年龄从小到大排序
		int num = this.age - s.age;
		// int num = s.age - this.age;
		//年龄相同时，按照姓名的字母顺序排序
		int num2 = num == 0?this.name.compareTo(s.name):num;
		return num2;
	}
}
