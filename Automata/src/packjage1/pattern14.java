package packjage1;
/*
 * Enter number of row:  
7
       *
      ***
     *****
    *******
   *********
  ***********
 *************
 */
import java.util.Scanner;

public class pattern14 {
	public static void main(String[] args) {
		System.out.println("Enter number of row:  ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{	
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2+1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
}
