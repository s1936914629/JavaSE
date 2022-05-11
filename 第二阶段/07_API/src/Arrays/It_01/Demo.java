package Arrays.It_01;

/*
    冒泡排序：
        一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，
        依次对所有的数据进行操作，直至所有数据按要求完成排序
 */
public class Demo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {24, 69, 80, 57, 13};
		System.out.println("排序前：" + arrayToString(arr));
		
		/*
		for (int i = 0; i < arr.length - 1 - 0; i++) {
			//ArrayIndexOutOfBoundsException
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		
		System.out.println("第一次比较后：" + arrayToString(arr));
		
		for (int i = 0; i < arr.length - 1 - 1; i++) {
			//ArrayIndexOutOfBoundsException
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println("第二次比较后：" + arrayToString(arr));
		 */
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;
				}
			}
		}
		System.out.println("比较结束："+arrayToString(arr));
		
	}
	
	//把数组中的元素按照指定的规则组成一个字符串：[元素1, 元素2, ...]
	public static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
			} else {
				sb.append(arr[i]).append(",");
			}
		}
		sb.append("]");
		String s = sb.toString();
		return s;
	}
}
