package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/08 11；50
 */
public class TestPutBuffer {
    public static void main(String[] args) {
        byte[] sourceData1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] sourceData2 = {77,88,99};
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(sourceData1);
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(sourceData2);
        byteBuffer1.position(4);
        byteBuffer2.position(2);
        byteBuffer1.put(byteBuffer2);
        byte[] lowerArray = byteBuffer1.array();
        for (byte iterator:lowerArray){
            System.out.print(iterator + "\t");
        }
    }
}
