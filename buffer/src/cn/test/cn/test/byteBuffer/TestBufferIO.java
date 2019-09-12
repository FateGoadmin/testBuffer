package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/06 18：24
 */
public class TestBufferIO {
    public static void main(String[] args) {
        /**
         * 创建直接缓冲区
         */
        ByteBuffer byteBuffer =
                ByteBuffer.allocateDirect(Integer.MAX_VALUE );
        byte[] data = new byte[]{1};
        long nowTime = System.currentTimeMillis();

        for(int i = 0; i < byteBuffer.capacity();i++){
            byteBuffer.put(data);
        }
        System.out.println("直接缓冲区现在耗时时间为" + (System.currentTimeMillis() -  nowTime));

        ByteBuffer nonDirectBuffer = ByteBuffer.allocate(Integer.MAX_VALUE );
        nowTime   =  System.currentTimeMillis();
        for(int i = 0; i < byteBuffer.capacity();i++){
            nonDirectBuffer.put(data);
        }
        System.out.println("非直接现在耗时时间为" + (System.currentTimeMillis() -  nowTime));
    }
}
