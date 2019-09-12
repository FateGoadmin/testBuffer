package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/07 19：00
 */
public class TestPutException {
    public static void main(String[] args) {
        /**
         * 使用Put时当 offset+Length > 数组的length 会出现IndexOutOfExceptiom
         */
        byte[] sourceData = {1,2,3,4,5,6,7,8};
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
//        byteBuffer.put(sourceData,5,4);
        byteBuffer.put(sourceData,0,sourceData.length);
        byteBuffer.put(sourceData,0,sourceData.length);

    }
}
