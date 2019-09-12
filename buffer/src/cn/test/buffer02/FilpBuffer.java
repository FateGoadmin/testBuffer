package cn.test.buffer02;

import java.nio.CharBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-15 17:25
 */
public class FilpBuffer {
    public static void main(String[] args) {
        /**
         * 错误状态示范
         */
        CharBuffer charBuffer = CharBuffer.allocate(20);
        System.out.println("开始状态A缓冲区的状态：limit：" + charBuffer.limit() + "position" + charBuffer.position());

        charBuffer.put("我是韩国人我在美丽坚合众国");
        System.out.println("输入状态B缓冲区的状态：limit：" + charBuffer.limit() + "position" + charBuffer.position());

        charBuffer.position(0);

        System.out.println("还原状态B缓冲区的状态：limit：" + charBuffer.limit() + "position" + charBuffer.position());

        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get());
        }

        System.out.println();

        /**
         * 正确状态示范
         */
        System.out.println("正确状态A2缓冲区的状态：limit：" + charBuffer.limit() + "position" + charBuffer.position());
        charBuffer.clear();
        System.out.println("正确状态还原B2缓冲区的状态：limit：" + charBuffer.limit() + "position" + charBuffer.position());
        charBuffer.put("我是美国人");
        System.out.println("正确状态写入C2缓冲区的状态：limit：" + charBuffer.limit() + "position" + charBuffer.position());
        // charBuffer.limit(charBuffer.position());
        // charBuffer.position(0);
        charBuffer.flip();
        System.out.println("正确状态最终D2缓冲区的状态：limit：" + charBuffer.limit() + "position" + charBuffer.position());
        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get());
        }

    }
}
