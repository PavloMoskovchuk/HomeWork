package lesson31;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
//        Field fields[] = TestClass.class.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName());
//
//        }
//        System.out.println();
//
//        Method methods[] = TestClass.class.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//        }
//        System.out.println();

        TestClass t1 = new TestClass("testName", 25);
        try{
            Method method = TestClass.class.getDeclaredMethod("test");
            method.setAccessible(true);
            method.invoke(t1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

//        TestClass t1 = new TestClass("testName", 99);
//        try {
//            Method testMethod = TestClass.class.getDeclaredMethod("getInfo", int.class);
//            testMethod.setAccessible(true);
//            String result = (String) testMethod.invoke(t1, 88);
//            System.out.println(result);
//        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
//            e.printStackTrace();
//        }


    }
}
