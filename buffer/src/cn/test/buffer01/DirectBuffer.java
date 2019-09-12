package cn.test.buffer01;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-15 17:05
 */
public class DirectBuffer {
    public static void main(String[] args) {
        /**
         * 直接缓冲区的使用
         */
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1000);
        System.out.println(byteBuffer.isDirect());
    }
}
