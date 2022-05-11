package Object.It_01;

public class Studet extends Object{
	private String name;
	private int age;
	
	public Studet() {
	}
	
	public Studet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Studet{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
