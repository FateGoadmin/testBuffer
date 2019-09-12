package cn.test.buffer02;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-15 18:10
 */
public class TestRemaining {    public static void main(String[] args) {
        byte[] byteContainer = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteContainer);
        byteBuffer.limit(3);
        byteBuffer.position(2);
        System.out.println("byteBuffer.hasRemaining():" + byteBuffer.hasRemaining() + "byteBuffer.remaining" +
                byteBuffer.remaining());
    }
}
