package packjage1;
/*
 * Enter number of row:  
5
     * * * * * 
    *       * 
   *       * 
  *       * 
 * * * * * 

 */

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		System.out.println("Enter number of row:  ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int p=i;p<=n;p++)
			{
				System.out.print(" ");
			}
			if(i==1 || i==n)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{
				System.out.print("* ");
				for(int k=1;k<n-1;k++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
				System.out.println();
			}
		}
	}

}