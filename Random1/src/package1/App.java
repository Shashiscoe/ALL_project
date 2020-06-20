package package1;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class App {
	public static void main(String[] args){
		System.out.println("Enter the msg to be send");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println("Enter the key");
		int pk=scan.nextInt();
		
		RandomNumber R1=new RandomNumber(pk);
		RandomNumber R2=new RandomNumber(pk);
		try{
		byte[] key=Integer.toString(R1.generete()).getBytes("UTF-8");	
		MessageDigest sha=MessageDigest.getInstance("MD5");
		key=sha.digest(key);
		key=Arrays.copyOf(key,16);
		
		SecretKeySpec sk=new SecretKeySpec(key,"AES");
		byte[] iv={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		IvParameterSpec IVspec=new IvParameterSpec(iv);
		
		Cipher Encrypt;
		
		Encrypt = Cipher.getInstance("AES/CBC/PKCS5Padding");
		Encrypt.init(Cipher.ENCRYPT_MODE, sk, IVspec);
		byte[] encrypted = Encrypt.doFinal(str.getBytes());
		System.out.println("Encrypted string:: " + Arrays.toString(encrypted));

		byte[] key1=Integer.toString(R2.generete()).getBytes("UTF-8");	
		MessageDigest sha1=MessageDigest.getInstance("MD5");
		key1=sha.digest(key1);
		key1=Arrays.copyOf(key1,16);
		
		SecretKeySpec sk1=new SecretKeySpec(key,"AES");
		//byte[] iv={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		//IvParameterSpec IVspec=new IvParameterSpec(iv);
		
		Cipher decrypt;
		
		decrypt = Cipher.getInstance("AES/CBC/PKCS5Padding");
		decrypt.init(Cipher.DECRYPT_MODE, sk1, IVspec);
		byte[] decrypted = decrypt.doFinal(encrypted);
		System.out.println("decrypted string:: " + new String (decrypted, "UTF-8"));
		}
		catch(Exception e)
		{
		e.printStackTrace();
			
		}
	}

}
