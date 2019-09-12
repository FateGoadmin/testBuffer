package cn.test.cn.test.byteBuffer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date
 */
public class TestCleaner {
    public static void main(String[] args) throws InterruptedException ,
            NoSuchMethodException, InvocationTargetException ,IllegalAccessException{
        System.out.println("A");

        ByteBuffer byteBuffer  =
                ByteBuffer.allocateDirect(Integer.MAX_VALUE / 2);
        System.out.println("B");
        byte[] byteArray = new byte[]{1};

        System.out.println(Integer.MAX_VALUE);

        for(int i = 0; i < Integer.MAX_VALUE /  2;i++){
            byteBuffer.put(byteArray);
        }

        System.out.println("put end");

        Thread.sleep(1000);


        /**
         * Java 9 的cleaner機制
         */

        Method cleanerMethod = byteBuffer.getClass().getMethod("cleaner");
        cleanerMethod.setAccessible(true);
        Object returnValue = cleanerMethod.invoke(byteBuffer);
        Method cleanMethod = returnValue.getClass().getMethod("clean");
        cleanMethod.setAccessible(true);
        cleanMethod.invoke(returnValue);





    }
}
