package StringBuilder;

/*
    StringBuilder 的添加和反转方法
        public StringBuilder append(任意类型)：添加数据，并返回对象本身
        public StringBuilder reverse()：返回相反的字符序列
 */
public class StringBuilderDemo02 {
	public static void main(String[] args) {
		// 创建对象
		StringBuilder str = new StringBuilder();
		
		//public StringBuilder append(任意类型)：添加数据，并返回对象本身
		/*
		StringBuilder str1 = str.append("hello");
		System.out.println("str:" + str);
		System.out.println("str1:" + str1);
		System.out.println(str == str1);
		*/
		
		/*
		str.append("hello ");
		str.append("word ");
		str.append("java ");
		str.append(34);
		System.out.println("str:"+str);
		*/
		
		//链式编程
		str.append("hello ").append("word ").append("java ").append(15);
		System.out.println("str:"+str);
		
		// public StringBuilder reverse()：返回相反的字符序列
		str.reverse();
		System.out.println("str:"+str);
		
	}
}
