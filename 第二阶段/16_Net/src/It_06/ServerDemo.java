package It_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器：接收到的数据在控制台输出
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//创建服务器Socket对象
		ServerSocket ss = new ServerSocket(12345);
		
		//监听客户端的练剑，返回一个对应的Socket
		Socket s = ss.accept();
		
		//获取输入流
		/*
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		//释放资源
		ss.close();
	}
}
