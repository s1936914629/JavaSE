package It_04;

import java.io.*;

public class CopyJavaDemo01 {
	public static void main(String[] args) throws IOException {
		//根据数据源创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("13_CharStream\\src\\It_02\\ConversionStreamDemo.java"));
		//根据目的地创建字符缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("13_CharStream\\Copy.java"));
		
		//读写数据，复制文件
		//一次读写一个字符数据
		/*
		int ch;
		while ((ch=br.read())!=-1){
			bw.write(ch);
		}
		 */
		
		//一次读写一个字符数组数据
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1){
			bw.write(chs,0,len);
		}
		
		br.close();
		bw.close();
		
	}
}
