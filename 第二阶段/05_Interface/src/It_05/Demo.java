package It_05;
// 测试类
public class Demo {
	public static void main(String[] args) {
		//创建对象
		tableTennisPlayer tp = new tableTennisPlayer();
		tp.setName("王浩");
		tp.setAge(28);
		System.out.println(tp.getName()+","+tp.getAge());
		tp.eat();
		tp.study();
		tp.speak();
		System.out.println("----------");
		
		BasketballPlayer bp = new BasketballPlayer();
		bp.setName("姚明");
		bp.setAge(35);
		System.out.println(bp.getName()+","+bp.getAge());
		bp.eat();
		bp.study();
		System.out.println("----------");
		
		tableTennisCoach tc = new tableTennisCoach("张三",35);
		System.out.println(tc.getName()+","+tc.getAge());
		tc.eat();
		tc.teach();
		tc.speak();
		System.out.println("---------");
		
		BasketballCoach bc = new BasketballCoach("李四",37);
		System.out.println(bc.getName()+","+bc.getAge());
		bc.eat();
		bc.teach();
	}
}
