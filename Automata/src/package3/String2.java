package package3;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char arr[]=str.toCharArray();
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			int count=1;
			for(int j=i+1;j<len;j++)
			{
				
				if(arr[i]==arr[j] && arr[j]!=0)
				{
					arr[j]=0;
					count++;
				}
			}
			if(arr[i]!=0)
			{
				System.out.println(arr[i]+" :"+ count);

			}
			
		}
		
		
	}

}
