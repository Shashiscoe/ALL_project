package packjage1;

import java.util.Scanner;

/*
 * Enter number:
5
1
12
123
1234
12345
1234
123
12
1*/

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		
		}
		for(int i=0;i<n-1;i++)
		{
		
			for(int k=1;k<n-i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
