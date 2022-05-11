package It_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    练习：通过反射实现如下操作
        Student s = new Student();
        s.name = "林青霞";
        s.age = 30;
        s.address = "西安";
        System.out.println(s);
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取Class对象
        Class<?> c = Class.forName("It_02.Student");

        //Student s = new Student();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

        //s.name = "林青霞";
        // Field field = c.getField("name");  //NoSuchFieldException: name
        Field field = c.getDeclaredField("name");
        field.setAccessible(true);
        field.set(obj,"林青霞");
        System.out.println(obj);

        //s.age = 30;
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(obj,20);
        System.out.println(obj);

        //s.address = "西安";
        Field address = c.getDeclaredField("address");
        address.setAccessible(true);
        address.set(obj,"西安");
        System.out.println(obj);



    }

}
