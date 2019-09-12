package invalid.cn.test.invalid.mark;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:检查mark与limiit的关系
 * @date 2019-07-02 15:32
 */
public class TestMarkLimit {
    public static void main(String[] args) {
        byte[] byteAray = new byte[]{1,2,3,4};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteAray);
        byteBuffer.position(1);
        byteBuffer.mark();
        try{
            /**
             * 当limit 》 mark  时 mark不会更改为-1  重设成功
             */
            byteBuffer.limit(2);
            byteBuffer.reset();
        }catch (Exception ex){

            System.out.println(ex.getClass());
        }
        try{
            /**
             * 当mark》 limit时 mark 会被修改为-1    c重设失败
             */
            byteBuffer.limit(0);
            byteBuffer.reset();
        }catch (Exception ex){
            System.out.println(ex.getStackTrace());
            System.out.println(ex.getClass());
        }

    }
}
