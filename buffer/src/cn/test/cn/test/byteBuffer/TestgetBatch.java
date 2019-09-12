package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/07 19：45
 */
public class TestgetBatch {
    public static void main(String[] args) {
        byte[] sourceData = {1,2,3,4,5,6,7,8,9};
        byte[] desData = new byte[5];
        ByteBuffer byteBuffer = ByteBuffer.wrap(sourceData);

        int index = 0;
        int time = 0;
        while(byteBuffer.position() < byteBuffer.limit() ){
            int saveLength = Math.min(byteBuffer.remaining(),desData.length);
            byteBuffer.get(desData,0,saveLength);
            System.out.println(time + "th content :");
            for(int i = 0; i < saveLength;i++){
                System.out.print( desData[i] + "\t");
            }
            index = index+saveLength;

        }
    }
}
