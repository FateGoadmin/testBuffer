package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/08 11:07
 */
public class TestAllIterator {
    public static void main(String[] args) {
        byte[] sourceData = new byte[100000];
        ByteBuffer byteBuffer = ByteBuffer.allocate(100);
        int startIndex = 0;
        for (int i = 0; i< sourceData.length;i++){
            sourceData[i] = (byte)(i % 128);
        }

        while(startIndex < sourceData.length){
            int readByteNum = Math.min(sourceData.length - startIndex,
                    byteBuffer.remaining());
            byte[] iteratorData = Arrays.copyOfRange(sourceData,startIndex,
                    startIndex + readByteNum);
            byteBuffer.put(iteratorData);

            byte[] allocateArray = byteBuffer.array();
            for (byte iterator : allocateArray){
                System.out.print(iterator + "\t");
            }
            System.out.println();

            startIndex += readByteNum;
            byteBuffer.flip();
        }

    }
}
