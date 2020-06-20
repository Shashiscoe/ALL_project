package packjage1;

/*
 *  1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1 
 */
import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		System.out.println("Enter number of row:  ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
