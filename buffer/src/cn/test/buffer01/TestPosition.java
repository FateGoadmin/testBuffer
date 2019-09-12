package cn.test.buffer01;

import java.nio.CharBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-06-26 18:15
 */
public class TestPosition {
    public static void main(String[] args) {
        /**
         * 测试缓冲器的position属性
         */

        char[] charArray = new char[] {'a', 'b', 'c', 'd'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("charBuffer.capacity=" + charBuffer.capacity() + "charBuffer.limit =" + charBuffer.limit()
            + "charBuffer.position" + charBuffer.position());
        charBuffer.position(2);
        System.out.println("B.capacity=" + charBuffer.capacity() + "B.limit " + "=" + charBuffer.limit() + "B.position"
            + charBuffer.position());
        charBuffer.put('e');
        for (char iterator : charArray) {
            System.out.println(iterator);
        }
        String buff = "";

    }
}
