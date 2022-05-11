package StringBuilder;

/*
    StringBuilder构造方法：
        public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
        public StringBuilder(String str)：根据字符串的内容，来创建可变字符串对象
 */
public class StringBuilderDemo01 {
	public static void main(String[] args) {
		// public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
		StringBuilder str= new StringBuilder();
		System.out.println("str:"+str);
		System.out.println("str.length():"+str.length());
		
		//  public StringBuilder(String str)：根据字符串的内容，来创建可变字符串对象
		StringBuilder str2 = new StringBuilder("hello");
		System.out.println("str2:"+str2);
		System.out.println("str2.length():"+str2.length());
	}
}

