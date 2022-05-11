package It_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：
        把“E:\\itcast\\窗里窗外.txt”复制到模块目录下的“窗里窗外.txt”

        数据源：
            E:\\itcast\\窗里窗外.txt --- 读数据 --- InputStream --- FileInputStream
        目的地：
            myByteStream\\窗里窗外.txt --- 写数据 --- OutputStream --- FileOutputStream

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        4:释放资源
 */
public class CopyTxtDemo {
	public static void main(String[] args) throws IOException {
		//根据数据源创建字节输入流对象
		FileInputStream fis = new FileInputStream("G:\\java资料\\黑马\\第1阶段企业级开发—Java基础+javaweb\\1、java零基础入门到精通24天\\零起点打开ja-va世界的大门资料\\第二阶段资料\\二阶day8资料\\素材\\itcast\\窗里窗外.txt");
		
		//根据目的地创建字节输出流对象
		FileOutputStream fos= new FileOutputStream("12_ByteStream\\窗里窗外.txt");
		
		//读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
		int by;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}
}
