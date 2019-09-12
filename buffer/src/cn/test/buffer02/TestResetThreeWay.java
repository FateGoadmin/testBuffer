package cn.test.buffer02;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-15 18:31
 */
public class TestResetThreeWay {
    public static void main(String[] args) {
        byte[] byteContainer = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteContainer);
        System.out.println("原始状态A为" + "cacapcity="+ byteBuffer.capacity() +
                " limit=" + byteBuffer.limit() + "  positon=" + byteBuffer.position());
        byteBuffer.position(1);
        byteBuffer.limit(3);
        byteBuffer.mark();

        System.out.println("更改状态B为" + "cacapcity="+ byteBuffer.capacity() +
                " limit=" + byteBuffer.limit() + "  positon=" + byteBuffer.position());

        byteBuffer.rewind();
        System.out.println("最终状态C为" + "cacapcity="+ byteBuffer.capacity() +
                " limit=" + byteBuffer.limit() + "  positon=" + byteBuffer.position());
        byteBuffer.reset();
    }
}
