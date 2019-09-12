package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 209/08/06· 18:43
 */
public class Testwrap {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3,4,5};
        ByteBuffer sourceBuffer = ByteBuffer.wrap(byteArray);
        System.out.println("sourceBuffer.capacity=" + sourceBuffer.capacity() + " sourceBuffer.limit=" + sourceBuffer.limit() + " sourceBuffer.position=" + sourceBuffer.position()
        );

        ByteBuffer packageBuffer = ByteBuffer.wrap(byteArray,2,2);
        System.out.println("packaegBuffer.capacity=" + packageBuffer.capacity() +
                "packaegBuffer.limit=" + packageBuffer.limit() + "packaegBuffer.position=" + packageBuffer.position()
        );

    }
}
