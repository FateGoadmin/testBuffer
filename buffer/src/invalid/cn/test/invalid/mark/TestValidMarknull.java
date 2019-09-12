package invalid.cn.test.invalid.mark;

import java.nio.ByteBuffer;

/**
 * @author
 * @ClassName:
 * @Description:
 * @date 2019-07-02 15:49
 */
public class TestValidMarknull {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.reset();
    }
}
