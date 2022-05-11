package It;

import java.io.File;
import java.io.IOException;

/*
    File类的判断和获取功能：
        public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
        public boolean isFile()：测试此抽象路径名表示的File是否为文件
        public boolean exists()：测试此抽象路径名表示的File是否存在

        public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
        public String getPath()：将此抽象路径名转换为路径名字符串
        public String getName()：返回由此抽象路径名表示的文件或目录的名称

        public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class Demo04 {
	public static void main(String[] args) throws IOException {
		//创建一个File对象
		File f = new File("10_File\\java.txt");
		boolean b = f.createNewFile();
		// public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
		System.out.println(f.isDirectory());  //false
		
		// public boolean isFile()：测试此抽象路径名表示的File是否为文件
		System.out.println(f.isFile());   //false
		
		// public boolean exists()：测试此抽象路径名表示的File是否存在
		System.out.println(f.exists());  //false
		
		// public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
		System.out.println(f.getAbsoluteFile());   //E:\java\学习\黑马\Java入门\第二阶段\10_File\java.txt
		
		// public String getPath()：将此抽象路径名转换为路径名字符串
		System.out.println(f.getPath());   //10_File\java.txt
		
		// public String getName()：返回由此抽象路径名表示的文件或目录的名称
		System.out.println(f.getName());   //java.txt
		System.out.println("--------");
		
		File f2 = new File("10_File\\itcast");
		// public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
		String[] strArray = f2.list();
		for(String str:strArray){
			System.out.println(str);
		}
		System.out.println("---------");
		
		// public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
		File[] fileArray = f2.listFiles();
		for(File file:fileArray){
			System.out.println(file);
		}
		
		
		
		
	}
	
}
