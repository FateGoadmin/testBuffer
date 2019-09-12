package invalid;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-02 14:53
 */
public class TestValidLimit0 {
    public static void main(String[] args) {
        /**
         * 测试limit不能为0
         */
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        try{
            byteBuffer.limit(-1);
        }catch (Exception ex){
            System.out.println("byteBuffer.limit 属性不能为0");
        }
    }
}
