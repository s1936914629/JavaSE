package StringBuilder;
/*
    StringBuilder 转换为 String
        public String toString()：通过 toString() 就可以实现把 StringBuilder 转换为 String

    String 转换为 StringBuilder
        public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder
 */
public class StringBuilderDemo03 {
	public static void main(String[] args) {
		//  StringBuilder 转换为 String
		StringBuilder str = new StringBuilder();
		
		str.append("hello");
		// String s = str;   //这个是错误的做法
		// public String toString()：通过 toString() 就可以实现把 StringBuilder 转换为 String
		String str1=str.toString();
		System.out.println("str1:"+str1);
		
		
		// String 转换为 StringBuilder
		String str2 = "hello";
		// StringBuilder str3 = str2; //这个是错误的做法
		// public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder
		StringBuilder str3 = new StringBuilder(str2);
		str3.append("word");
		System.out.println(str3);
		
	}
}
