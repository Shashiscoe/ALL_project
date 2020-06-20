package packjage1;
/*
 * Enter number of row:  
7
*******
******
*****
****
***
**
*

 */
import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		System.out.println("Enter number of row:  ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{			
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
