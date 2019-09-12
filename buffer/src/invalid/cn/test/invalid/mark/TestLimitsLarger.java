package invalid.cn.test.invalid.mark;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-02 16:20
 */
public class TestLimitsLarger {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
//        byteBuffer.position(2);
        byteBuffer.limit(2);
//        byteBuffer.put((byte)100);
//
//        for(byte iterator:byteArray){
//            System.out.println(iterator);
//        }

        for(int i = 0; i < 2;i++){
            byteBuffer.put((byte)100);
        }


        for(byte iterator:byteArray){
            System.out.println(iterator);
        }


//



    }
}
