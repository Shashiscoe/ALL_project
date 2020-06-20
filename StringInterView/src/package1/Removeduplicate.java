package package1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Removeduplicate {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		char arr[]=str.toCharArray();
		int len=arr.length;
		String str1="";
	
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[j]!='0')
				{
					if(arr[i]==arr[j])
					{
						arr[j]='0';
					}
				}
				
				
			}
		}
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]!='0')
			{
				str1=str1+arr[i];
			}
		}
		System.out.println("String after duplicate removal");
		System.out.println(str1);

	}

}
