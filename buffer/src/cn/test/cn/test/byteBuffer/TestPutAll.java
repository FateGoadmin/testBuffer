package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/08 10:44
 */
public class TestPutAll {
    public static void main(String[] args) {
        byte[] byteArray = {1,2,3,4,5,6,7,8};
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        byteBuffer.put((byte)1);
        byteBuffer.put((byte)2);

        System.out.println("A=" + byteBuffer.position());

        byteBuffer.put(byteArray);
        System.out.println("B=" + byteBuffer.position());
        byteBuffer.flip();
        byteBuffer.position(3);
        byte[] getData = new byte[byteBuffer.remaining()];
        byteBuffer.get(getData);

        for(byte data:getData){
            System.out.println(data + "/t");
        }
    }
}
