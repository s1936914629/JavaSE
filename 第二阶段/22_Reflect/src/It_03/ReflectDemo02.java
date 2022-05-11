package It_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("It_02.Student");

        //public Student(String name, int age, String address)
        //Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        //基本数据类型也可以通过.class得到对应的Class类型

        //T newInstance(Object... initargs)
        Object obj = con.newInstance("小红", 20, "上海");
        System.out.println();


    }
}
