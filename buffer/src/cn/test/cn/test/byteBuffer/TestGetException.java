package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/07 19;39
 */
public class TestGetException {
    public static void main(String[] args) {
        /**
         * IndexOutOfException
         */
//        byte[] desData = new byte[5];
//        byte[] sourceData = {1,2,3,4,5,6,7,8,9};
//        ByteBuffer byteBuffer = ByteBuffer.wrap(sourceData);

//        byteBuffer.get(desData,0,byteBuffer.array().length);

        /**
         * BufferunderFlowException
         */
        byte[] desData = new byte[100];
        byte[] sourceData = {1,2,3,4,5,6,7,8,9};
        ByteBuffer byteBuffer = ByteBuffer.wrap(sourceData);

        byteBuffer.get(desData,0,desData.length);
    }
}
