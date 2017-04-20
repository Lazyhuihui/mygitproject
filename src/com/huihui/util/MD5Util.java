package com.huihui.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * @author treemanz
 */
public class MD5Util {
    
    private static MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /**
     * 獲取字符串的MD5碼
     * 
     * @param plainText
     * @return MD5的16進制字符串表示
     */
    public static String getStringMD5(String plainText) {
        MessageDigest messageDigest = getMessageDigest();
        messageDigest.update(plainText.getBytes());
        byte bytes[] = messageDigest.digest();
        String str = toHexString(bytes);
        return str;
    }
    /**
     * 獲取文件的MD5碼
     * 
     * @param plainText
     * @return MD5的16進制字符串表示
     */
    public static String getFileMD5(String src) {
        File file = new File(src);
        FileInputStream in = null;
		try {
			in = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        FileChannel ch = in.getChannel();  
        MappedByteBuffer byteBuffer = null;
		try {
			byteBuffer = ch.map(FileChannel.MapMode.READ_ONLY, 0,file.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        MessageDigest messageDigest = getMessageDigest();
        messageDigest.update(byteBuffer);
        return bufferToHex(messageDigest.digest());  
    }


    /**
     * @param args
     */
    private static char[] hexChar = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
        'e', 'f'
    };

    /**
     * @param bytes
     * @return
     */
    private static String toHexString(byte[] bytes) {
        // long time1 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            sb.append(hexChar[(bytes[i] & 0xf0) >>> 4]);
            sb.append(hexChar[bytes[i] & 0x0f]);
        }

        // long time2 = System.currentTimeMillis();
        // System.out.println("bite:" + (time2 - time1));
        return sb.toString();
    }
    
    private static String bufferToHex(byte bytes[]) {  
        return bufferToHex(bytes, 0, bytes.length);  
    }  
    
    private static String bufferToHex(byte bytes[], int m, int n) {  
        StringBuffer stringbuffer = new StringBuffer(2 * n);  
        int k = m + n;  
        for (int l = m; l < k; l++) {  
            appendHexPair(bytes[l], stringbuffer);  
        }  
        return stringbuffer.toString();  
    }  
    
    private static void appendHexPair(byte bt, StringBuffer stringbuffer) {  
        char c0 = hexChar[(bt & 0xf0) >> 4];  
        char c1 = hexChar[bt & 0xf];  
        stringbuffer.append(c0);  
        stringbuffer.append(c1);  
    }  
    
    
    public static void main(String[] args) {
    	String stringMD5 = getStringMD5("1111111").substring(2, 15);
    	System.out.println(stringMD5);
	}
}

