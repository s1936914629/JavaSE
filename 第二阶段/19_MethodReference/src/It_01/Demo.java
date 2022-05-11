package It_01;

/*
    需求：
        1:定义一个接口(Printable)：里面定义一个抽象方法：void printString(String s);
        2:定义一个测试类(PrintableDemo)，在测试类中提供两个方法
            一个方法是：usePrintable(Printable p)
            一个方法是主方法，在主方法中调用usePrintable方法
 */
public class Demo {
    public static void main(String[] args) {
        //在主方法中调用usePrintable方法
        /*
        usePrintable((String s) -> {
            System.out.println(s);
        });
        */

        // usePrintable(s -> System.out.println(s));

        // 方法应用符：  ::
        usePrintable(System.out::println);

        // 可推到的就是可省略的





    }

    private static void usePrintable(Printable p) {
        p.printString("阳光不燥，微风正好");
    }
}
