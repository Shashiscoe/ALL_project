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
	
	public static void main(String args[])
	{
		System.out.println("Enter msg:: ");
		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.nextLine();
		
		System.out.println("Enter key:: ");
		int pk = sc.nextInt();
		
		RandomNumber R1 = new RandomNumber(pk);
		RandomNumber R2 = new RandomNumber(pk);
		
		
		try {
			byte[] key;
				key = Integer.toString(R1.generate()).getBytes("UTF-8");
				
				MessageDigest SHA = null;
				try {
					SHA = MessageDigest.getInstance("SHA-1");
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				key = SHA.digest(key);
				key = Arrays.copyOf(key,16);
				
				SecretKeySpec sk = new SecretKeySpec(key,"AES");
				byte[] iv = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				IvParameterSpec IVspec = new IvParameterSpec(iv);
				
				Cipher Encrypt = null;
				try {
					Encrypt = Cipher.getInstance("AES/CBC/PKCS5Padding");
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NoSuchPaddingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Encrypt.init(Cipher.ENCRYPT_MODE,sk,IVspec);
				} catch (InvalidKeyException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidAlgorithmParameterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				byte[] encrypted = null;
				try {
					encrypted = Encrypt.doFinal(str.getBytes());
				} catch (IllegalBlockSizeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (BadPaddingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Encrypted string:: "+ Arrays.toString(encrypted));
				
				byte[] key1 = null;
				key = Integer.toString(R2.generate()).getBytes("UTF-8");
				
				MessageDigest SHA1 = null;
				try {
					SHA1 = MessageDigest.getInstance("SHA-1");
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				key1 = SHA1.digest(key1);
				key1 = Arrays.copyOf(key1,16);
				
				SecretKeySpec sk1 = new SecretKeySpec(key1,"AES");
				//byte[] iv = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				//IvParameterSpec IVspec = new IvParameterSpec(iv);
				
				Cipher Decrypt = null;
				try {
					Decrypt = Cipher.getInstance("AES/CBC/PKCS5Padding");
				} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Decrypt.init(Cipher.DECRYPT_MODE,sk1,IVspec);
				} catch (InvalidKeyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidAlgorithmParameterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				byte[] decrypted = null;
				try {
					decrypted = Decrypt.doFinal(encrypted);
				} catch (IllegalBlockSizeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BadPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("decryted string:: "+ new String(decrypted,"UTF-8"));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
