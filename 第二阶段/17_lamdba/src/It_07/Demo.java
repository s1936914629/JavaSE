package It_07;

/*
    Lambda表达式和匿名内部类的区别
 */
public class Demo {
    public static void main(String[] args) {
        //匿名内部类
        /*
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });

        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });
        */

        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        //lambda
        /*
        useInter(() -> System.out.println("接口"));
        // useAnimal(() -> System.out.println("抽象类"));  //lambda表达式必须使接口
        // useStudent(() -> System.out.println("具体类")); //lambda必须是接口
        */

        /*
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("show");
            }

            @Override
            public void shwo2() {
                System.out.println("show2");
            }
        });
        */

    }

    private static void useStudent(Student s) {
        s.study();
    }

    private static void useAnimal(Animal a) {
        a.method();
    }

    private static void useInter(Inter i) {
        i.show();
    }
}
