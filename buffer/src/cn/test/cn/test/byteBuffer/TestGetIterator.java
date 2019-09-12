package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2010/08/08
 */
public class TestGetIterator {
    public static  final int  TIME_READ_NUM = 3;
    public static void main(String[] args) {
        byte[] sourceData = {1,2,3,4,5,6,7,8,9,10};
        ByteBuffer byteBuffer = ByteBuffer.wrap(sourceData);

        while(byteBuffer.hasRemaining()){
            int readNum = Math.min(byteBuffer.remaining(),
                    TestGetIterator.TIME_READ_NUM);
            byte[] readArray = new byte[readNum];
            byteBuffer.get(readArray);
            System.out.println();
            for (byte iterator:readArray){
                System.out.print(iterator + "\t");
            }


        }

    }
}
