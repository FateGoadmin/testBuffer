package invalid;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-02 14:49
 */
public class TestValidPosition0 {
    public static void main(String[] args) {
        /**
         * position属性不能为负数
         */
        try{
            byte[] byteArray = new byte[]{1,2,3};
            ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
            byteBuffer.position(-1);

        }catch (Exception ex){
            System.out.println("position属性不能为负数");
        }
    }
}
