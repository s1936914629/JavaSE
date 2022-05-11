package Collection.It_02;
/*
    public String getMessage():返回此 throwable 的详细消息字符串
    public String toString():返回此可抛出的简短描述
    public void printStackTrace():把异常的错误信息输出在控制台
 */
public class Demo02 {
	public static void main(String[] args) {
		System.out.println("开始");
		method();
		System.out.println("结束");
	}
	
	public static void method() {
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); //new ArrayIndexOutOfBoundsException();
			System.out.println("这里能够访问到吗");
		} catch (ArrayIndexOutOfBoundsException e) { //new ArrayIndexOutOfBoundsException()
			//public String getMessage():返回此 throwable 的详细消息字符串
			// System.out.println(e.getMessage());
			// Index 3 out of bounds for length 3
			
			//public String toString():返回此可抛出的简短描述
			System.out.println(e.toString());
			// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			
			//public void printStackTrace():把异常的错误信息输出在控制台
			e.printStackTrace();
			/*
			java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			at It_02.Demo02.method(Demo02.java:17)
			at It_02.Demo02.main(Demo02.java:10)
			 */
		}
	}
}
