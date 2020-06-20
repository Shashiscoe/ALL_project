package packjage1;

import java.util.Scanner;

/*
1****
12***
123**
1234*
12345
 */
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of row:  ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		/*for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(j+1);	
			}
			for(int k=0;k<n-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1);
			}
			for(int k=i+1;k<n;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
