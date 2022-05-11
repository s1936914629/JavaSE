package String;

import java.util.Scanner;

/*
    Scanner:
        用于获取键盘录入数据。(基本数据类型，字符串数据)

    public String nextLine()：
        获取键盘录入字符串数据
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入字符串:");
		String s = sc.nextLine();
		System.out.println("s:"+s);
	}
}

