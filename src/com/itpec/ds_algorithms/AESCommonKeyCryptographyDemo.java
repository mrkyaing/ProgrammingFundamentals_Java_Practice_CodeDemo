package com.itpec.ds_algorithms;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
public class AESCommonKeyCryptographyDemo {
  static  SecretKeySpec secretKey;
  static  byte[] key;	
	public static void main(String[] args) {
    String msg="မင်းရောဘာတွေလုပ်နေလဲဟေ့.အခြေအနေကောင်းလားဟ";
    String hiddenkey="admin@123";//
   String result= EncryptData(msg,hiddenkey);
   System.out.println(result);
   System.out.println("===========");
   String readmsg=DescryptData(result, hiddenkey);
   System.out.println(readmsg);
	}
	
	public static void setKey(String myKey)  {
		MessageDigest sha;
		try {
			key=myKey.getBytes("UTF-8");	
			sha = MessageDigest.getInstance("SHA-1");		
			key=sha.digest(key);
			key=Arrays.copyOf(key,16);
			secretKey=new SecretKeySpec(key,"AES");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
	
	public static String EncryptData(String plainText,String Commonkey) {
		  try {
			setKey(Commonkey);
			 Cipher cipher = Cipher.getInstance("AES");
			 cipher.init(Cipher.ENCRYPT_MODE, secretKey); 
			return Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes("UTF-8")));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		  return null;
		
	}
	
	public static String DescryptData(String CipherText,String Commonkey)  {
		 try {
			setKey(Commonkey);
			Cipher cipher = Cipher.getInstance("AES");
			 cipher.init(Cipher.DECRYPT_MODE, secretKey); 
			 return new String(cipher.doFinal(Base64.getDecoder().decode(CipherText)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 return null;
		 
		
	}

}
