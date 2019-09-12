package cn.test.buffer01;

import java.nio.CharBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-06-29 19:16
 */
public class TestReminging {
    public static void main(String[] args) {
        /**
         * 生成"charBuffer.capacity()=" + charBuffer.capacity() + "charBuffer.limit()" +
         *                 charBuffer.limit() + "position()" + charBuffer.position()相应的容器数组
         */
        char[] charArray = new char[]{'a', 'b', 'c', 'e'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("charBuffer.capacity()=" + charBuffer.capacity() + "charBuffer.limit()" +
                charBuffer.limit() + "position()" + charBuffer.position());
        charBuffer.position(2);
        System.out.println("charBuffer.capacity()=" + charBuffer.capacity() + "charBuffer.limit()" +
                charBuffer.limit() + "position()" + charBuffer.position());
        System.out.println("C.remaining()="   + charBuffer.remaining() );

    }
}
