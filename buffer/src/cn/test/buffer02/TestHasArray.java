package cn.test.buffer02;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-15 17:58
 */
public class TestHasArray {
    public static void main(String[] args) {
        /**
         * 直接allocate的Buffer的Class为  以及有底层数组
         */
        CharBuffer charBuffer = CharBuffer.allocate(10);
        System.out.println("allocate的class为" + charBuffer.getClass());
        charBuffer.put("a");
        charBuffer.put("b");
        System.out.println("charBuffer是否存在底层数组：" + charBuffer.hasArray());

        ByteBuffer DirectByteBuffer = ByteBuffer.allocateDirect(1000);
        System.out.println("Direct的Class = " + DirectByteBuffer.getClass());
        System.out.println("DirectBuffer是否存在底层数组：" + DirectByteBuffer.hasArray());

    }
}
