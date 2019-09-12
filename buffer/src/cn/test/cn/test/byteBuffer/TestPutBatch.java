package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/07 18:41
 */
public class TestPutBatch {
    public static void main(String[] args) {
        byte[] data1 = {1,2,3,4,5,6,7,8};
        byte[] data2  = {55,66,77,88};

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put(data1);
        //修改position位置
        byteBuffer.position(0);
        System.out.println(byteBuffer.get());
        //重新修改数据源 观看缓冲区内容
        byteBuffer.put(data2,1,3);
        System.out.println("缓冲区相关内容如下:");
        byte[] dataOfBuffer = byteBuffer.array();
        for(byte iterator:dataOfBuffer){
            System.out.print(iterator + "\t");
        }
        System.out.println();
        byteBuffer.position(1);
        byte[] desData = new byte[byteBuffer.capacity()];
        byteBuffer.get(desData,3,4);
        System.out.println("复制区数据如下");
        for (byte iterator:desData){
            System.out.print(iterator + "\t");
        }
    }
}
