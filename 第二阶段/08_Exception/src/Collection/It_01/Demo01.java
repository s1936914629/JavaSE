package Collection.It_01;
// 异常
public class Demo01 {
	public static void main(String[] args) {
		System.out.println("开始");
		method();
		System.out.println("结束");
	}
	
	public static void method(){
		int[] arr = {1,2,3};
		System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
	}
}
