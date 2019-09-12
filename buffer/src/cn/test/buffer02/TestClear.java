package cn.test.buffer02;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-15 17:11
 */
public class TestClear {
    public static void main(String[] args) {
        byte[] byteContainer = new byte[]{'a','b','c'};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteContainer);
        byteBuffer.position(2);
        byteBuffer.mark();
        /**
         * 测试clear后数据是否清除
         */
        byteBuffer.clear();
        try {
            byteBuffer.reset();
        }catch (Exception ex){
            System.out.println(ex.getClass());
        }
    }
}
