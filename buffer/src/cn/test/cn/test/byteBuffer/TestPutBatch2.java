package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/07 19:15'
 */
public class TestPutBatch2 {
    public static void main(String[] args) {
        byte[] sourceData = new byte[200000];
        ByteBuffer byteBuffer = ByteBuffer.allocate(100);
        for(int i = 0 ; i< sourceData.length;i++){
            sourceData[i]= (byte)(i % 128);
        }
        int startIndex =0;
        int time = 1;

        while(startIndex < sourceData.length){
            int restByte = Math.min(sourceData.length - startIndex,
                    byteBuffer.remaining());

            byteBuffer.put(sourceData,startIndex,restByte);
            byte[] readByte = byteBuffer.array();
            System.out.println("第" + time + "次读取数据如下:");
            for (byte iterator : readByte){
                System.out.print(iterator + "\t");
            }
            System.out.println();
            byteBuffer.flip();
            startIndex  = startIndex + restByte;
            time++;
        }

    }
}
