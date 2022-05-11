package itheima_01;

import java.util.ArrayList;

/*
    ArrayList构造方法：
        public ArrayList()：创建一个空的集合对象

    ArrayList添加方法：
        public boolean add(E e)：将指定的元素追加到此集合的末尾
        public void add(int index,E element)：在此集合中的指定位置插入指定的元素
 */
public class ArrayListDemo01 {
	public static void main(String[] args) {
		//  public ArrayList()：创建一个空的集合对象
		ArrayList<String> arr= new ArrayList<String>();
		
		// public boolean add(E e)：将指定的元素追加到此集合的末尾
		arr.add("Hello");
		arr.add("Word");
		arr.add("Java");
		
		System.out.println(arr);
		
		// public void add(int index,E element)：在此集合中的指定位置插入指定的元素
		arr.add(1,"Javaee");
		System.out.println(arr);
		
		
		//array.add(4,"javaee");  //IndexOutOfBoundsException索引越界
		
		
	}
}
