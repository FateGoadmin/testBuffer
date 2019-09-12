package invalid.cn.test.invalid.mark;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:测试position与mark之间的关系
 * @Description:
 * @date 2019-07-02 15:15
 */
public class TestValidMarkPosition1 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{11,2,3,4};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.position(2);
        byteBuffer.mark();
//        try{
//            /**
//             * 当mark大于position时 mark会变成null   此时无法reset
//             */
//            byteBuffer.position(0);
//            byteBuffer.reset();
//        }catch(Exception ex){
//            System.out.println("position < mark 预设失败 MARK丢弃");
//        }

        try{
            byteBuffer.position(3);
            byteBuffer.reset();
        }catch (IllegalArgumentException ex){
            System.out.println("position > mark 预设失败 MARK丢弃");
        }

    }
}
