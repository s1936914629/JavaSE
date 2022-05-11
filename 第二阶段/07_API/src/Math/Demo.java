package Math;

public class Demo {
	public static void main(String[] args) {
		//public static int abs(int a)：返回参数的绝对值
		int a=12;
		int a1=-13;
		System.out.println(Math.abs(a)+Math.abs(a1));
		System.out.println("--------");
		
		//public static double ceil(double a)：返回大于或等于参数的最小double值，等于一个整数
		double d=12.1;
		double d1=12.5;
		System.out.println(Math.ceil(d)+","+Math.ceil(d1));
		System.out.println("--------");
		
		//public static double floor(double a)：返回小于或等于参数的最大double值，等于一个整数
		double d2=12.1;
		double d3=12.5;
		System.out.println(Math.floor(d2)+","+Math.floor(d3));
		System.out.println("--------");
		
		//public static int round(float a)：按照四舍五入返回最接近参数的int
		float f= 14.4f;
		float f1= 14.5f;
		System.out.println(Math.round(f)+","+Math.round(f1));
		System.out.println("--------");
		
		//public static int max(int a,int b)：返回两个int值中的较大值
		int b=4;
		int b1=6;
		System.out.println(Math.max(b,b1));
		System.out.println("--------");
		
		//public static int min(int a,int b)：返回两个int值中的较小值
		int c=54;
		int c1=48;
		System.out.println(Math.min(c,c1));
		System.out.println("--------");
		
		//public static double pow(double a,double b)：返回a的b次幂的值
		double i=2.0;
		double i1=3.0;
		System.out.println(Math.pow(i,i1));
		System.out.println("--------");
		
		//public static double random()：返回值为double的正值，[0.0,1.0)
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*100)+1);
	}
}
