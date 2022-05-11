package String;

import java.util.Scanner;

/*
    需求：
        已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示

    思路：
        1:已知用户名和密码，定义两个字符串表示即可
        2:键盘录入要登录的用户名和密码，用 Scanner 实现
        3:拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals() 方法实现
        4:用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
 */
public class StringTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 已知用户名和密码，定义两个字符串表示即可
		String user = "user";
		String pass = "123456";
		
		// 用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
		for (int i = 0; i < 3; i++) {
			// 键盘录入要登录的用户名和密码，用 Scanner 实现
			System.out.println("请输入用户名");
			String name = sc.nextLine();
			
			System.out.println("请输入密码");
			String pwd = sc.nextLine();
			// 拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals() 方法实现
			if (name.equals(user) && pwd.equals(pass)) {
				System.out.println("登录成功");
				break;
			} else if (2 - i == 0) {
				System.out.println("你没有机会了，请与管理员联系");
			} else {
				System.out.println("登录失败,你还有" + (2 - i) + "次机会");
			}
		}
	}
}
