package It_04;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为Map集合的使用
 */
public class PropertiesDemo01 {
	public static void main(String[] args) {
		//创建集合对象
        //Properties<String,String> prop = new Properties<String,String>(); //错误
		Properties prop = new Properties();
		
		//存储元素
		prop.put("it001","张三");
		prop.put("it002","李四");
		prop.put("it003","王五");
		
		//遍历集合
		Set<Object> keySet = prop.keySet();
		for(Object key:keySet){
			Object value = prop.get(key);
			System.out.println(key+","+value);
		}
	}
}
