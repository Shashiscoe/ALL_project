package package1;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App1 {


	private static boolean containUCL(String str) {
		Pattern p=Pattern.compile("[A-Z]",Pattern.CANON_EQ);
		Matcher m=p.matcher(str);
		return m.find();
	}
	private static boolean containSpecialChar(String str) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("^[a-z0-9]",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(str);
		return m.find();
		
	}
	private static boolean contaionNumber(String str) {
		
		Pattern p=Pattern.compile("[0-9]",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(str);
		return m.find();
		}
	
	public static void main(String[] args) {
		System.out.println("Enter the message you want to encrypt:");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		EncryptPassword cipher=null;
		if(!containUCL(str) && !contaionNumber(str) && !containSpecialChar(str))
		{
			try {
				System.out.println("Calling unsecure Method");
				cipher=new EncryptPassword(new SecurePassword(str));
	
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
				try {
					System.out.println("Calling secure hash Function");
					
					cipher =new EncryptPassword(new UnsecurePassword(str));
				} catch (NoSuchAlgorithmException e) {
				
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			
		}

		System.out.println("encrypted password is"+ Arrays.toString(cipher.getEncryptPassword()));
	}

}
