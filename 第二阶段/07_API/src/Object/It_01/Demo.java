package Object.It_01;

public class Demo {
	public static void main(String[] args) {
		Studet s = new Studet();
		s.setAge(18);
		s.setName("小红");
		System.out.println(s);   //Object.It_01.Studet@776ec8df
		System.out.println(s.toString());  //Object.It_01.Studet@776ec8df
		
		/*
        public void println(Object x) { //x = s;
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) { //obj = x;
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
      */
	}
}
