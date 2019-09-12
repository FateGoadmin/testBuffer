package invalid;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-02 15:08
 */
public class TestValidLimitCapacity {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        try{
            byteBuffer.limit(byteBuffer.capacity() );
        }catch (Exception ex){
            System.out.println("buffer.limit不能大于capacity");
        }
    }
}
