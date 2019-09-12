package cn.test.cn.test.byteBuffer;

import java.nio.ByteBuffer;

/**
 * @author cyf
 * @ClassName:
 * @Description:
 * @date 2019/08/06 18:55
 */
public class TestPut {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println("初始状态buffer如下" + byteBuffer.capacity() + " limit=" + byteBuffer.limit() +  " position =" + byteBuffer.position() );

        byteBuffer.put((byte)125);
        System.out.println("状态添加buffer如下" + byteBuffer.capacity() + " limit=" + byteBuffer.limit() +  " position =" + byteBuffer.position() );

        byteBuffer.put((byte) 126);
        System.out.println("状态添加buffer如下" + byteBuffer.capacity() + " limit=" + byteBuffer.limit() +  " position =" + byteBuffer.position() );

        byteBuffer.put((byte) 127);
        System.out.println("状态添加buffer如下" + byteBuffer.capacity() + " limit=" + byteBuffer.limit() +  " position =" + byteBuffer.position() );
        byteBuffer.rewind();

        System.out.println("遍历Buffer程序如下" + byteBuffer.get());
        System.out.println("get状态buffer如下" + byteBuffer.capacity() + " limit" +
                "=" + byteBuffer.limit() +  " position =" + byteBuffer.position() );

        System.out.println("遍历Buffer程序如下" + byteBuffer.get());
        System.out.println("get状态buffer如下" + byteBuffer.capacity() + " limit" +
                "=" + byteBuffer.limit() +  " position =" + byteBuffer.position() );


        System.out.println("遍历Buffer程序如下" + byteBuffer.get());
        System.out.println("get状态buffer如下" + byteBuffer.capacity() + " limit" +
                "=" + byteBuffer.limit() +  " position =" + byteBuffer.position() );

        /**
         * 獲得底層數值
         */

        byte[] byteArray = byteBuffer.array();
        System.out.println("遍历数组");
        for(byte i : byteArray){
            System.out.println(i);
        }


    }
}
