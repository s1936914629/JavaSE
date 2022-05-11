package Integer.It_02;

/*
    构造方法：
        public Integer(int value)：根据 int 值创建 Integer 对象(过时)
        public Integer(String s)：根据 String 值创建 Integer 对象(过时)

    静态方法获取对象：
        public static Integer valueOf(int i)：返回表示指定的 int 值的 Integer 实例
        public static Integer valueOf(String s)：返回一个保存指定值的 Integer 对象 String
 */
public class Demo {
	public static void main(String[] args) {
		/*
		Integer i = new Integer(100);
		Integer i1 = new Integer("100");
		System.out.println(i+i1);
		 */
		
		// public static Integer valueOf(int i)：返回表示指定的 int 值的 Integer 实例
		Integer i = Integer.valueOf(12);
		System.out.println(i);
		
		// public static Integer valueOf(String s)：返回一个保存指定值的 Integer 对象 String
		Integer i1 = Integer.valueOf("11");
		System.out.println(i1);
		
		
	}
}
