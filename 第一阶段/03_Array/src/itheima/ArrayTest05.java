package itheima;

/*
    获取最值
        获取数组中的最大值
        最小值同学们自己完成
 */
public class ArrayTest05 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {12, 45, 98, 73, 60};
		
		//定义一个变量，用于保存最大值
		int max, min;
		
		//取数组中第一个数据作为变量的初始值
		max = arr[0];
		min = arr[0];
		
		//与数组中剩余的数据逐个比对，每次比对将最大值保存到变量中
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			
		}
		
		
		//循环结束后打印变量的值
		System.out.println("最大的值是：" + max);
		System.out.println("最小的值是：" + min);
		
		
	}
}

