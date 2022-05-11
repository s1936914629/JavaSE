package It_02;

public interface Inter {
    void shwo();

    default void method(){
        System.out.println("Inter中的默认方法执行了");
    }

    /*
    public static void test(){
        System.out.println("Inter中的的静态方法执行了");
    }
    */

    static void test(){
        System.out.println("Inter中的静态方法执行了");
    }

}
