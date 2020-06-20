package packjage1;
/*
 * Diamond pattern 
 * Enter number:
7
       *
      ***
     *****
    *******
   *********
  ***********
 **************/
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2+1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}