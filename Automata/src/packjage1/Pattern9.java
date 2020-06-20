package packjage1;

import java.util.Scanner;

/*
 * 
 *  1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 */
public class Pattern9 {

	public static void main(String[] args) {
		
		System.out.println("Enter number of row:  ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(k+1+" ");
			}
			System.out.println();
		}
		
		
		/*for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(k+1+" ");
			}
			System.out.println();
		}*/
	}

}
