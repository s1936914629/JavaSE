package It_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("G:\\java资料\\黑马\\第1阶段企业级开发—Java基础+javaweb\\1、java零基础入门到精通24天\\零起点打开ja-va世界的大门资料\\第二阶段资料\\二阶day8资料\\素材\\itcast\\mn.jpg");
		//根据目的地创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("12_ByteStream\\mn.jpg");
		
		//读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
		byte[] bys = new byte[1024];
		int len;
		while ((len = fis.read(bys))!=-1){
			fos.write(bys,0,len);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}
}
