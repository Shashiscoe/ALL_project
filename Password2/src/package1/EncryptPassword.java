package package1;

import java.io.UnsupportedEncodingException;
import java.rmi.UnexpectedException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptPassword {
	byte[] password;

	public EncryptPassword(SecurePassword sp) throws NoSuchAlgorithmException , UnsupportedEncodingException{
	
		MessageDigest md5=MessageDigest.getInstance("MD5");
		password=md5.digest(sp.Password.getBytes("UTF-8"));
	}

	public EncryptPassword(UnsecurePassword usp) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest sha=MessageDigest.getInstance("SHA-1");
		password=sha.digest(usp.Password.getBytes("UTF-8"));
	}

	public byte[] getEncryptedPassword() {
		// TODO Auto-generated method stub
		return password;
	}

}
