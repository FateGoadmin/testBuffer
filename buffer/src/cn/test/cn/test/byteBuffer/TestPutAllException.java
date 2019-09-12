package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 22019/08/08 10:52
 */
public class TestPutAllException {
    public static void main(String[] args) {
//        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
//        byte[] sourceData = {1,2,3,4,5,6,7,8,9,10};
//        /**
//         * 引发bufferOverFlowException
//         */
//        byteBuffer.put(sourceData);


        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byte[] sourceData = {1,2,3,4,5,6,7,8,9,10};

        byteBuffer.put(sourceData);

        byteBuffer.position(5);
        byte[] desData = new byte[10];

        /**
         * 引发bufferUnderFlowException
         */
        byteBuffer.get(desData);

    }
}
