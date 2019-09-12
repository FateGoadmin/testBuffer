package invalid;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-02 14:44
 */
public class TestInvalidCapacity0 {
    public static void main(String[] args) {
        /**
         *ccapacity 不能为0
         */
       try{
           ByteBuffer byteBuffer = ByteBuffer.allocate(-1);
       }catch (Exception ex){
           System.out.println("capacity 属性不能为0");
       }

    }
}
