package package1;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptPassword {
		byte[] Password;
		
		
		
		
		
		public EncryptPassword(SecurePassword sp)
		{
			try {
				MessageDigest md5=MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
   public EncryptPassword(UnsecurePassword usp) throws NoSuchAlgorithmException, UnsupportedEncodingException
   {
	   MessageDigest sha = MessageDigest.getInstance("SHA-1");
	   Password = sha.digest(usp.Password.getBytes("UTF-8"));
	   
   }

	byte[] getEncryptPassword() {
		// TODO Auto-generated method stub
		return Password;
	}

}
