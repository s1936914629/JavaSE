package It_02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
	public static void main(String[] args) throws IOException {
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("12_ByteStream\\fos.txt");
		//调用字节输入流对象的读数据方法
		//int read(byte[] b)：从该输入流读取最多 b.length个字节的数据到一个字节数组
		
		// byte[] bys = new byte[5];
		
		/*
		//第一次读取数据
		int len = fis.read(bys);
		System.out.println(len);
		//String(byte[] bytes)
        //System.out.println(new String(bys));
		System.out.println(new String(bys,0,len));
		
		//第二次读取数据
		len = fis.read(bys);
		System.out.println(len);
       // System.out.println(new String(bys));
		System.out.println(new String(bys,0,len));

		//第三次读取数据
		len = fis.read(bys);
		System.out.println(len);
		//String(byte[] bytes, int offset, int length)
		System.out.println(new String(bys,0,len));
		
		//再多读取两次
		len = fis.read(bys);
		System.out.println(len);
		len = fis.read(bys);
		System.out.println(len);
		len = fis.read(bys);
		
		 */
		
		 /*
            hello\r\n
            world\r\n

            第一次：hello
            第二次：\r\nwor
            第三次：ld\r\n

         */
		byte[] bys = new byte[1024];   //1024及其整数倍
		int len;
		while ((len = fis.read(bys))!=-1){
			System.out.println(new String(bys,0,len));
		}
		
		//释放资源
		fis.close();
	}
}
