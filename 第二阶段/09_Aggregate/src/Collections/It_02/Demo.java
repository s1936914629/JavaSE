package Collections.It_02;

import java.util.ArrayList;
import java.util.Collections;

/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌

    思路：
        1:创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        2:往牌盒里面装牌
        3:洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
        4:发牌，也就是遍历集合，给三个玩家发牌
        5:看牌，也就是三个玩家分别遍历自己的牌
 */
public class Demo {
	public static void main(String[] args) {
		//创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
		ArrayList<String> list = new ArrayList<String>();
		
		//往牌盒里面装牌
		/*
            ♦2,♦3,♦4...♦K,♦A
            ♣2,...
            ♥2,...
            ♠2,...
            小王，大王
         */
		//定义花色数组
		String[] colors = {"♥", "♠", "♦", "♣"};
		//定义点数数组
		String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		//获得所有牌
		for (String color : colors) {
			for (String number : numbers) {
				list.add(color + number);
			}
		}
		
		list.add("大王");
		list.add("小王");
		
		//洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
		Collections.shuffle(list);
		// System.out.println(list);
		
		//发牌，也就是遍历集合，给三个玩家发牌
		ArrayList<String> yi = new ArrayList<String>();
		ArrayList<String> er = new ArrayList<String>();
		ArrayList<String> san = new ArrayList<String>();
		ArrayList<String> dp = new ArrayList<String>();
		
		for (int i = 0; i < list.size(); i++) {
			String poker = list.get(i);  //计数器
			if (i >= list.size() - 3) {
				dp.add(poker);
			} else if (i % 3 == 0) {
				yi.add(poker);
			} else if (i % 3 == 1) {
				er.add(poker);
			} else if (i % 3 == 2) {
				san.add(poker);
			}
		}
		
		//看牌，也就是三个玩家分别遍历自己的牌
		look("一号",yi);
		look("二号",er);
		look("三号",san);
		look("底牌",dp);
		
	}
	
	//定义看牌方法
	public static void look(String name,ArrayList<String> list){
		System.out.print(name+"的牌是：");
		for(String poker:list){
			System.out.print(poker+" ");
		}
		System.out.println();
	}
}
