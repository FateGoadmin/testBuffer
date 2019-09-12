package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/06 18:16
 */
public class TestCleaner1 {
    public static void main(String[] args)  throws InterruptedException{
        ByteBuffer byteBuffer  =
                ByteBuffer.allocateDirect(Integer.MAX_VALUE );
        System.out.println("B");
        byte[] byteArray = new byte[]{1};

        System.out.println(Integer.MAX_VALUE);

        for(int i = 0; i < Integer.MAX_VALUE ;i++){
            byteBuffer.put(byteArray);
        }

        System.out.println("put end");

        Thread.sleep(1000);

    }
}
