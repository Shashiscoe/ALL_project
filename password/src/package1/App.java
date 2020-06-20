package package1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class App {
	public static boolean containsUCL(String str)
	{
		Pattern p = Pattern.compile("[A-Z]", Pattern.CANON_EQ);
		Matcher m = p.matcher(str);
		return m.find();
	}
	public static boolean containsNumber(String str)
	{
		Pattern p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		return m.find();
	}
	public static boolean containsSpecialChar(String str)
	{
		Pattern p = Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		return m.find();
	}
	public static void main(String[] args) {
		
		System.out.println("Enter password to be encrypted:: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		EncryptPassword cipher = null;
		
		if(!containsUCL(str) && !containsNumber(str) && !containsSpecialChar(str))
		{
			System.out.println("calling secure hash method");
			
			try {
				cipher = new EncryptPassword(new SecurePassword(str));}
		catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("calling unsecure hash method");
			try {
				cipher = new EncryptPassword ( new UnsecurePassword(str));
			} catch (NoSuchAlgorithmException e) {
				
				e.printStackTrace();
			}catch(UnsupportedEncodingException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Encrypted string:: " + Arrays.toString(cipher.getEncryptPassword()));
	}

}
