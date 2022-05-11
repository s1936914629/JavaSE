package itheima;

/*
    带返回值方法的定义和调用

    定义格式：
        public static 数据类型 方法名(参数) {
	        return 数据;
	    }

	调用格式：
        1:方法名(参数);
        2:数据类型 变量名 = 方法名(参数);
 */
public class MethodDemo03 {
	public static void main(String[] args) {
		boolean result = isEvenNumber(10);
		System.out.println(result);
		boolean result2 = isEvenNumber(9);
		System.out.println(result2);
	}
	
	//需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数，并返回真假值
	public static boolean isEvenNumber(int num){
		if(num % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
}
