package cn.test.buffer01;


import java.nio.*;

/**
 * @author
 * @ClassName:;
 * @Description:
 * @date 2019-06-26 16:37
 */
public class TestWrap {
    /**
     * 测试Buffer的wrap的方法
     * @param args
     */
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        short[]shortArray = new short[]{1,2,3,4};
        int[]intArray = new int[]{1,2,3,4,5};
        long[]longArray = new long[]{1,2,3,4,5,6};
        float[] floatArray = new float[]{1,2,3,4,5,6,7};
        double[] doubleArray = new double[]{1,2,3,4,5,6,7,8};
        char[]charArray = new char[]{'a','b','c','d'};

        /**
         * 使用wrap方法
         */
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        ShortBuffer shortBuffer = ShortBuffer.wrap(shortArray);
        IntBuffer intBuffer = IntBuffer.wrap(intArray);
        LongBuffer longBuffer = LongBuffer.wrap(longArray);
        FloatBuffer floatBuffer = FloatBuffer.wrap(floatArray);
        DoubleBuffer doubleBuffer = DoubleBuffer.wrap(doubleArray);
        CharBuffer charBuffer = CharBuffer.wrap(charArray);


        /**
         * 获得最终类的声明
         */
        System.out.println("byteBuffer=" + byteBuffer.getClass().getName());
        System.out.println("shortBuffer=" + shortBuffer.getClass().getName());
        System.out.println("intBuffer=" + intBuffer.getClass().getName());
        System.out.println("longBuffer=" + longBuffer.getClass().getName());
        System.out.println("floatBuffer=" + floatBuffer.getClass().getName());
        System.out.println("doubleBuffer=" + doubleBuffer.getClass().getName());
        System.out.println("charBuffer=" + charBuffer.getClass().getName());

        /**
         * 获得Buffer的相关容量
         */
        System.out.println("bytebuffer.capcaity=" + byteBuffer.capacity());
        System.out.println("shortBuffer.capcacity="  + shortBuffer.capacity());
        System.out.println("intBuffer.capcacity=" + intBuffer.capacity());
        System.out.println("longBuffer.capacity=" + longBuffer.capacity());
        System.out.println("charBuffer.capacity=" + charBuffer.capacity());
        System.out.println("floatBuffer.capacity=" + floatBuffer.capacity());
        System.out.println("DoubleBuffer.capacity=" + doubleBuffer.capacity());



    }
}
