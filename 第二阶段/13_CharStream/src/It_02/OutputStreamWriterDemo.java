package It_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
    构造方法：
        OutputStreamWriter(OutputStream out)：创建一个使用默认字符编码的OutputStreamWriter

    写数据的5种方式：
        void write(int c)：写一个字符
        void write(char[] cbuf)：写入一个字符数组
        void write(char[] cbuf, int off, int len)：写入字符数组的一部分
        void write(String str)：写一个字符串
        void write(String str, int off, int len)：写一个字符串的一部分
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//OutputStreamWriter(OutputStream out)：创建一个使用默认字符编码的
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("13_CharStream\\osw.txt") );
		
		/*
		//void write(int c)：写一个字符
		osw.write(97);
		//void flush()：刷新流
		osw.write(98);
		osw.write(99);
		osw.flush();
		*/
		
		/*
		//void write(char[] cbuf)：写入一个字符数组
		char[] chs = {'h','e','l','l','o'};
		osw.write(chs);
		 */
		
		/*
		//void write(char[] cbuf, int off, int len)：写入字符数组的一部分
		char[] chs = {'h','e','l','l','o'};
		osw.write(chs,1,3);
		 */
		
		/*
		//void write(String str)：写一个字符串
		osw.write("world");
		 */
		
		//void write(String str, int off, int len)：写一个字符串的一部分
		osw.write("world",1,3);
		osw.write("world",1,"world".length());
		
		osw.close();
	}
}
