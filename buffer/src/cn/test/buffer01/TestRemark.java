package cn.test.buffer01;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-02 14:24
 */
public class TestRemark {
    public static void main(String[] args) {
        /**
         * 测试标记属性
         */
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        System.out.println("byteBBuffer.capacity() ="  + byteBuffer.capacity() + " byteBuffer.position=" +
                byteBuffer.position()  );
        byteBuffer.position(1);
        byteBuffer.mark();
        System.out.println("byteBBuffer.capacity() ="  + byteBuffer.capacity() + " byteBuffer.position=" +
                byteBuffer.position());
        byteBuffer.position(0);
        byteBuffer.reset();
        System.out.println("byteBBuffer.capacity() ="  + byteBuffer.capacity() + " byteBuffer.position=" +
                byteBuffer.position());
    }
}
