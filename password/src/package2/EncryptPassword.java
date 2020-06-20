package package2;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptPassword {
	byte[] Password;
	
	
	
	public EncryptPassword(SecurePassword sp) throws NoSuchAlgorithmException,UnsupportedEncodingException{
	
		MessageDigest md5=MessageDigest.getInstance("MD5");
		Password=md5.digest(sp.Password.getBytes("UTF-8"));
		}
	public EncryptPassword(UnsecurePassword usp) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		
		MessageDigest sh1=MessageDigest.getInstance("SHA-1");
		Password=sh1.digest(usp.Password.getBytes("UTF-8"));
	}
	public byte[] getEncryptedPassword()
	{
		return Password;
	}
	
}
