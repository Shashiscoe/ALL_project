package package1;

import java.util.Scanner;
/*enter the number:
5
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
  
  */

public class pattern3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
