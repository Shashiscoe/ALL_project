package packjage1;

import java.util.Scanner;

/**
 * Enter a number between 1 to 9 : 4
   1
  121
 12321
1234321*
*/
public class Pattern5 {

	public static void main(String[] args) {
		System.out.println("Ente number n:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		int k;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(k=0;k<(i*2+1)/2;k++)
			{
				System.out.print(k+1+" ");
			}
			for(int p=1;p<(i*2+1)/2;p++)
			{
				System.out.print(--k+" ");
			}
				
			//System.out.print("*");
			System.out.println();
		}
	}
}
