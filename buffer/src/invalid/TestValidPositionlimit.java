package invalid;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-02 14:59
 */
public class TestValidPositionlimit {
    public static void main(String[] args) {
        /**
         * position<= limit
         */
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.limit(1);
        try{
            byteBuffer.position(2);
        }catch (Exception ex){
            System.out.println("buffer的position属性不能大于limit");
        }
    }
}
