package Collection.It_02;
/*
    try {
        可能出现异常的代码;
    } catch(异常类名 变量名) {
        异常的处理代码;
    }
 */
public class Demo01 {
	public static void main(String[] args) {
		System.out.println("开始");
		method();
		System.out.println("结束");
	}
	
	public static void method(){
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]);
			System.out.println("这里能够访问");
		}catch (ArrayIndexOutOfBoundsException e){
			// System.out.println("你访问的数组越界");
			e.printStackTrace();
		}
	}
}
