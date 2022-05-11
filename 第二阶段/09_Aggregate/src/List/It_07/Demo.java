package List.It_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
    List集合常用子类：ArrayList，LinkedList
        ArrayList：底层数据结构是数组，查询快，增删慢
        LinkedList：底层数据结构是链表，查询慢，增删快

    练习：
        分别使用ArrayList和LinkedList完成存储字符串并遍历
 */
public class Demo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("hello");
		array.add("word");
		array.add("java");
		
		//遍历
		for(String s:array){
			System.out.println(s);
		}
		System.out.println("--------");
		Iterator<String> it = array.iterator();
		while (it.hasNext()){
			String s =it.next();
			System.out.println(s);
		}
		System.out.println("--------");
		for (int i = 0;i<array.size();i++){
			String s = array.get(i);
			System.out.println(s);
		}
		System.out.println("--------------");
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("hello");
		linkedList.add("word");
		linkedList.add("java");
		
		for(String s:linkedList){
			System.out.println(s);
		}
		System.out.println("--------");
		Iterator<String> ite = linkedList.iterator();
		while (ite.hasNext()){
			String s = ite.next();
			System.out.println(s);
		}
		System.out.println("--------");
		for(int i =0;i<linkedList.size();i++){
			String s = linkedList.get(i);
			System.out.println(s);
		}
		
	}
}
