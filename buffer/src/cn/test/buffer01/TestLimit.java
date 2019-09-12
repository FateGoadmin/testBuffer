package cn.test.buffer01;

import java.nio.CharBuffer;

/**
 * @author
 * @ClassName: 测试缓冲区的相关限制
 * @Description:
 * @date 2019-06-26 17:52
 */
public class TestLimit {
    public static void main(String[] args) {
        char[] charArray = new char[]{'a', 'b', 'c', 'd', 'e'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("charBuffer.capacity=" + charBuffer.capacity() + "limit()=" + charBuffer.limit());
        charBuffer.limit(3);
        System.out.println();
        System.out.println("b.capacity=" + charBuffer.capacity() + "limit()=" + charBuffer.limit());
        charBuffer.put(0,'1');
        charBuffer.put(1,'2');
        charBuffer.put(2,'3');
        charBuffer.put(3,'4');
        charBuffer.put(4,'5');

    }
}
