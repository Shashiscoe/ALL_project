package package2;
import java.util.Scanner;

public class RemovingVowel {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);	
		String str=scan.nextLine();
		char a[]=str.toCharArray();
		int len=str.length();
		char b[]=new char[len];
		int count=0;
		
		
		for(int i=0;i<len;i++)			
		{
			if(a[i]=='a' || a[i]=='e'|| a[i]=='i' || a[i]=='o' || a[i]=='u'|| a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')
			{
				;
			}
			else
			{
				b[count]=a[i];
				count++;
			}
		}
		char str1[]=new char[count];
		for(int i=0;i<count;i++)
		{
			str1[i]=b[i];
		}
		//convert character array into string 
		String s=String.valueOf(str1);
		System.out.print(s);
	
	}

}
