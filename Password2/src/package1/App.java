package package1;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.EncryptedPrivateKeyInfo;

import package1.EncryptPassword;

public class App {

	private static boolean containsSpecialChar(String str) {
		Pattern p = Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		return m.find();
	}

	private static boolean containsUCL(String str) {
		Pattern p=Pattern.compile("[A-Z]",Pattern.CANON_EQ);
		Matcher m=p.matcher(str);
		return m.find();
	}

	private static boolean containsNumber(String str) {
		Pattern p=Pattern.compile("[0-9]",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(str);
		return m.find();
			}

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the password to Encrypt");
		Scanner scan=new Scanner(System.in);
		
		String str=scan.nextLine();
		EncryptPassword cipher = null;
		if(!containsUCL(str) && !containsNumber(str) && !containsSpecialChar(str))
		{
			System.out.println("Calling secure hash Method.....");
			cipher=new EncryptPassword(new SecurePassword(str));
		}
		else
		{
			System.out.println("Calling Unsecure hash Method.....");
			cipher=new EncryptPassword(new UnsecurePassword(str));
		}

		System.out.println("Encrypted string:: "+ Arrays.toString(cipher.getEncryptedPassword()));
		
			

	}
}
