package package2;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class App {

	public static void main(String[] args) {
		System.out.println("Enter msg to be sent:: ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println("Enter key");
		int pk = sc.nextInt();
		
		RandomNumber R1 = new RandomNumber(pk);
		RandomNumber R2 = new RandomNumber(pk);
		try{
		byte[] key = Integer.toString(R1.generate()).getBytes("UTF-8");
		
		MessageDigest SHA = MessageDigest.getInstance("SHA-1");
		key = SHA.digest(key);
		key = Arrays.copyOf(key,16);
		
		SecretKeySpec sk = new SecretKeySpec(key,"AES");
		byte[] iv = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		IvParameterSpec IVspec = new IvParameterSpec(iv);
		
		Cipher Encrypt;
		
		Encrypt = Cipher.getInstance("AES/CBC/PKCS5Padding");
		Encrypt.init(Cipher.ENCRYPT_MODE, sk, IVspec);
		byte[] encrypted = Encrypt.doFinal(str.getBytes());
		System.out.println("Encrypted string:: " + Arrays.toString(encrypted));
		
		
byte[] key1 = Integer.toString(R2.generate()).getBytes("UTF-8");
		
		MessageDigest SHA1 = MessageDigest.getInstance("SHA-1");
		key1 = SHA1.digest(key1);
		key1 = Arrays.copyOf(key1,16);
		
		SecretKeySpec sk1 = new SecretKeySpec(key,"AES");
	//	byte[] iv = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		//IvParameterSpec IVspec = new IvParameterSpec(iv);
		
		Cipher Decrypt;
		
		Decrypt = Cipher.getInstance("AES/CBC/PKCS5Padding");
		Decrypt.init(Cipher.DECRYPT_MODE, sk1, IVspec);
		byte[] decrypted = Decrypt.doFinal(encrypted);
		System.out.println("Decrypted string:: " + new String (decrypted, "UTF-8"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


