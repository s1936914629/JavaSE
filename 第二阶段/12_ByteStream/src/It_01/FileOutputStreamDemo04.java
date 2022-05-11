package It_01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {
	public static void main(String[] args) {
		/*
		try {
			fos = new FileOutputStream("12_ByteStream\\fos.txt");
			fos.write("hello".getBytes());
			fos.close;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 */
		
		//加入finally来实现释放资源
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("12_ByteStream\\fos.txt");
			fos.write("hello".getBytes());
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
