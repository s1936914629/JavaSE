package StudentManager;

public class Student {
	//学号
	private String sid;
	//姓名
	private String name;
	//年龄
	private String age;
	//居住地
	private String address;
	
	
	// 构造方法
	public Student() {
	}
	
	public Student(String sid, String name, String age, String address) {
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// 成员方法    Alt+Insert  根据自己的需要进行选择
	public String getSid() {
		return sid;
	}
	
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
