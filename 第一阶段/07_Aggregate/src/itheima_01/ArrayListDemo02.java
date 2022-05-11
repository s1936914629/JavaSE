package itheima_01;

import java.util.ArrayList;

/*
    ArrayList常用方法：
        public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        public E get(int index)：返回指定索引处的元素
        public int size()：返回集合中的元素的个数
 */
public class ArrayListDemo02 {
	public static void main(String[] args) {
		//创建集合
		ArrayList<String> arr = new ArrayList<String>();
		
		//添加元素
		arr.add("Hello");
		arr.add("Word");
		arr.add("Java");
		/*
		// public boolean remove(Object o)：删除指定的元素，返回删除是否成功
		System.out.println(arr.remove("Hello"));
		System.out.println(arr.remove("Javaee"));
		*/
		
		/*
		// public E remove(int index)：删除指定索引处的元素，返回被删除的元素
		System.out.println(arr.remove(1));
		// System.out.println(array.remove(3));  // IndexOutOfBoundsException索引越界
		*/
		
		/*
		// public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
		System.out.println(arr.set(1,"Javaee"));
		*/
		
		/*
		// public E get(int index)：返回指定索引处的元素
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		// System.out.println(arr.get(3));  // 索引越界
		*/
		
		// public int size()：返回集合中的元素的个数
		System.out.println(arr.size());
		
		// 输出集合
		System.out.println("arr:" + arr);
		
	}
}
