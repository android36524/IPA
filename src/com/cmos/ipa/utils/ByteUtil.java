package com.cmos.ipa.utils;

/**
 * <code>字节转换工具类</code>
 * @author Hardy
 * @date 2016/4/29 11:40
 * @version 1.0
 */
public class ByteUtil {

    /**
     * <code>byte to integer</code>
     * @param byte0
     * @return
     */
    protected static int ByteToInt(byte byte0){
        return byte0;
    }

    /**
     * <code>byte to integer</code>
     * @param abyte0
     * @return
     */
    protected static int BytesToInt(byte abyte0[]){
        return ((0xff & abyte0[0]) << 8) + abyte0[1];
    }

    /**
     * <code>4 bytes to integer</code>
     * @param abyte0
     * @return
     */
    protected static int Bytes4ToInt(byte abyte0[]){
        return (0xff & abyte0[0]) << 24 | (0xff & abyte0[1]) << 16 |(0xff & abyte0[2]) << 8 | 0xff & abyte0[3];
    }

    /**
     * <code>8 bytes to long</code>
     * @param abyte0
     * @return
     */
    protected static long Bytes8ToLong(byte abyte0[])
    {
        long ret = 0;

        ret = (0xffL & abyte0[0]) << 56 | (0xffL & abyte0[1]) << 48 | (0xffL & abyte0[2]) << 40 | (0xffL & abyte0[3]) << 32 | (0xffL & abyte0[4]) << 24 | (0xffL & abyte0[5]) << 16 | (0xffL & abyte0[6]) << 8 | 0xffL & abyte0[7];

        return ret;
    }

    /**
     *
     * @param srcAbyte
     * @param destAbyte
     * @param srcFrom: srcindex
     * @param srcTo
     * @param destFrom
     */
    protected static void BytesCopy(byte srcAbyte[], byte destAbyte[], int srcFrom, int srcTo, int destFrom)
    {
        // check null
        if( srcAbyte == null || destAbyte == null  ) {
            return;
        }
        // copy
        int i1 = 0;
        for(int l = srcFrom; l <= srcTo; l++ )
        {
            if( destFrom + i1 >= destAbyte.length ) {
                break;
            }
            if( l >= srcAbyte.length ) {
                break;
            }
            destAbyte[destFrom + i1] = srcAbyte[l];
            i1++;
        }
    }

    /**
     *
     * @param i
     * @return
     */
    public static byte IntToByte(int i)
    {
        return (byte)i;
    }

    /**
     *
     * @param i
     * @return
     */
    protected static byte[] IntToBytes(int i)
    {
        byte abyte0[] = new byte[2];
        abyte0[1] = (byte)(0xff & i);
        abyte0[0] = (byte)((0xff00 & i) >> 8);
        return abyte0;
    }
    /**
     *
     * @param i
     * @param abyte0
     */
    protected static void IntToBytes(int i, byte abyte0[])
    {
        abyte0[1] = (byte)(0xff & i);
        abyte0[0] = (byte)((0xff00 & i) >> 8);
    }

    /**
     *
     * @param i
     * @return
     */
    protected static byte[] IntToBytes4(int i)
    {
        byte abyte0[] = new byte[4];
        abyte0[3] = (byte)(0xff & i);
        abyte0[2] = (byte)((0xff00 & i) >> 8);
        abyte0[1] = (byte)((0xff0000 & i) >> 16);
        abyte0[0] = (byte)((0xff000000 & i) >> 24);
        return abyte0;
    }

    /**
     *
     * @param i
     * @param abyte0
     */
    protected static void IntToBytes4(int i, byte abyte0[])
    {
        abyte0[3] = (byte)(0xff & i);
        abyte0[2] = (byte)((0xff00 & i) >> 8);
        abyte0[1] = (byte)((0xff0000 & i) >> 16);
        abyte0[0] = (byte)(int)((0xffffffffff000000L & (long)i) >> 24);
    }

    /**
     *
     * @param i
     * @return
     */
    protected static byte[] LongToBytes8(long i)
    {
        byte abyte0[] = new byte[8];
        abyte0[7] = (byte)(0xffL & i);
        abyte0[6] = (byte)((0xff00L & i) >> 8);
        abyte0[5] = (byte)((0xff0000L & i) >> 16);
        abyte0[4] = (byte)((0xff000000L & i) >> 24);
        abyte0[3] = (byte)((0xff00000000L & i) >> 32);
        abyte0[2] = (byte)((0xff0000000000L & i) >> 40);
        abyte0[1] = (byte)((0xff000000000000L & i) >> 48);
        abyte0[0] = (byte)((0xff00000000000000L & i) >> 56);
        return abyte0;
    }
}
