package package1;

import java.util.Scanner;

/*
 * Enter number:
5
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
     **/
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for(int i=1;i<num;i++)
		{
			for(int j=-1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<num-i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
