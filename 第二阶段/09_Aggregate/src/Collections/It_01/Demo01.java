package Collections.It_01;

import java.util.*;

/*
    Collections类的概述
        是针对集合操作的工具类

    Collections类的常用方法
        public static <T extends Comparable<? super T>> void sort(List<T> list)：将指定的列表按升序排序
        public static void reverse(List<?> list)：反转指定列表中元素的顺序
        public static void shuffle(List<?> list)：使用默认的随机源随机排列指定的列表
 */
public class Demo01 {
	public static void main(String[] args) {
		//创建对象
		List<Integer> l = new ArrayList<Integer>();
		
		//添加元素
		l.add(20);
		l.add(50);
		l.add(30);
		l.add(10);
		
		//public static <T extends Comparable<? super T>> void sort(List<T> list)：将指定的列表按升序排序
		// Collections.sort(l);
		
		//public static void reverse(List<?> list)：反转指定列表中元素的顺序
		// Collections.reverse(l);
		
		//public static void shuffle(List<?> list)：使用默认的随机源随机排列指定的列表
		Collections.shuffle(l);
		
		System.out.println(l);
	}
}
