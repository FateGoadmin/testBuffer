package invalid;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:测试position与limit的关系
 * @date 2019-07-02 15:56
 */
public class TestValidLimitPosition {
    public static void main(String[] args) {
        byte[] byteArray = new byte[] {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.position(3);
        System.out.println("byteBuffer.position =" + byteBuffer.position());
        byteBuffer.limit(2);
        System.out.println("byteBuffer.position=" + byteBuffer.position());

        /**
         * 当position大于limit时
         */
         byteBuffer.position(2);
         System.out.println("byteBuffer.position =" + byteBuffer.position() +
         "byteBuffer.limit="+ byteBuffer.limit());
    }
}
