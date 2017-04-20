package com.huihui.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * @author ygchiaaa
 * 對稱加密算法
 */
public class AESencryptUtil {

	
	private Cipher _encrypt;
	private Cipher _decrypt;
	
	private static AESencryptUtil defaultInstance;
	
	private static AESencryptUtil passwordInstance;
	
	public static AESencryptUtil getDefaultInstance() {
		if( defaultInstance == null) {
			try {
				defaultInstance= new AESencryptUtil("a03cd5k6h8l04444");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return defaultInstance;
	}
	
	public static AESencryptUtil getPasswordInstance() {
		if( passwordInstance == null) {
			try {
				passwordInstance= new AESencryptUtil("a03cd5k6h8l05555");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return passwordInstance;
	}
	
	public AESencryptUtil(String privateKey) throws Exception {
		if(privateKey.length() % 8 != 0) {
			System.out.println("ken length = "+ privateKey.length());
		}
		SecretKeySpec key = new SecretKeySpec( privateKey.getBytes("utf-8"), "AES");
		_encrypt = Cipher.getInstance("AES");	
		_encrypt.init(Cipher.ENCRYPT_MODE, key);
		
		_decrypt = Cipher.getInstance("AES");
		_decrypt.init(Cipher.DECRYPT_MODE, key);
	}
	
	public String encrypt(String plainText) throws Exception {
		byte[] en = _encrypt.doFinal(plainText.getBytes("utf-8"));
		return parseBytesToHexString(en);
	}
	
	public String decrypt(String encryptString) throws Exception {
		byte[] bytes = parseHexStringToBytes(encryptString);
		byte[] de = _decrypt.doFinal(bytes);
		return new String(de);
	}
	
	private String parseBytesToHexString(byte[] byteArray) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<byteArray.length; i++) {
			String hex = Integer.toHexString(byteArray[i] & 0xFF);
			if(hex.length() == 1) {
				sb.append("0").append(hex);
			} else {
				sb.append(hex);
			}
		}
		return sb.toString();
	}
	
	private byte[] parseHexStringToBytes(String hexString) {
		byte[] result = new byte[hexString.length() / 2];
		for(int i=0; i<hexString.length() / 2; i++) {
			int high = Integer.parseInt(hexString.substring(i*2, i*2 + 1), 16);
			int low = Integer.parseInt(hexString.substring(i*2 + 1, i*2 + 2), 16);
			result[i] = (byte)(high * 16 + low);
		}
		return result;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(AESencryptUtil.getDefaultInstance().decrypt("00245a6bfc242f9a73b99b3ee361fb74"));
			
			System.out.println(AESencryptUtil.getPasswordInstance().decrypt("2da354e261350fb0f9c49f0251e4be0d"));
			
			System.out.println(MD5Util.getStringMD5("111111").substring(2, 15));
			System.out.println(AESencryptUtil.getPasswordInstance().decrypt("19129e680c9575ae43f40d526a9f5999"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
