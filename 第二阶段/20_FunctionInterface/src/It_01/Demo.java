package It_01;

public class Demo {
    public static void main(String[] args) {
        Interface i = () -> System.out.println("函数式接口");
        i.show();
    }
}
