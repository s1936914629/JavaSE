package itheima;

import java.util.Scanner;

/*
    需求：
        在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
        选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。

    思路：
        1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        2:键盘录入评委分数
        3:由于是6个评委打分，所以，接收评委分数的操作，用循环改进
        4:定义方法实现获取数组中的最高分(数组最大值)，调用方法
        5:定义方法实现获取数组中的最低分(数组最小值) ，调用方法
        6:定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法
        7:按照计算规则进行计算得到平均分
        8:输出平均分
 */
public class Test10 {
	public static void main(String[] args) {
		// 定义一个数组，用动态初始化完成数组元素的初始化，长度为6
		int[] arr = new int[6];
		// 键盘录入评委分数
		Scanner sc = new Scanner(System.in);
		// 由于是6个评委打分，所以，接收评委分数的操作，用循环改进
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "位评委的成绩：");
			arr[i] = sc.nextInt();
		}
		// printArray(arr);
		
		// 调用最大值方法
		int max = getMax(arr);
		
		// 调用最小值方法
		int min = getMin(arr);
		
		// 调用求和方法
		int sum = getSum(arr);
		
		// 求平均分数
		int avg = (sum - max - min) / (arr.length - 2);
		
		System.out.println("这个选手的平均成绩为："+avg);
		
	}
	
	//遍历数组
	public static void printArray(int[] arr) {
		System.out.print("[");
		
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}
	
	/*
	 * 定义方法实现获取数组中的最高分(数组最大值)，调用方法
	 *    返回值类型：int
	 *    参数：int[] arr
	 * */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/*
	 * 定义方法实现获取数组中的最低分(数组最小值) ，调用方法
	 *    返回值类型：int
	 *    参数：int[] arr
	 * */
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	/*
	 * 定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法
	 *    返回值类型：int
	 *    参数：int[] arr
	 * */
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
