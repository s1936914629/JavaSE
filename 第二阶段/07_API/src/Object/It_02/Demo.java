package Object.It_02;

import Object.It_01.Studet;

public class Demo {
	public static void main(String[] args) {
		Studet stu = new Studet("小玉",19);
		
		Studet stu2 = new Studet("小张",20);
		
		//需求：比较两个对象的内容是否相同
		// System.out.println(stu == stu2);
		
		System.out.println(stu.equals(stu2));
		
		/*
            public boolean equals(Object obj) {
                //this -- s1
                //obj -- s2
                return (this == obj);
            }
         */
		
	}
}
