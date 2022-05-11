package itheima;

/*
    带参数方法的定义和调用

    定义格式：
        public static void 方法名(参数) { … … }

	调用格式：
        方法名(参数);
 */
public class MethodDemo02 {
	public static void main(String[] args) {
		isEvenNumber(10);
		isEvenNumber(9);
	}
	
	//需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
	public static void isEvenNumber(int num) {
		if (num % 2 == 0) {
			System.out.println("是偶数");
		} else {
			System.out.println("是奇数");
		}
	}
	
}
