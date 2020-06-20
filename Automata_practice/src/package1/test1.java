package package1;

import java.util.Scanner;

/**
 * Enter number of row:  
5
A
BB
CCC
DDDD
EEEEE
*/

public class test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int num=scan.nextInt();
		char ch='A';
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch);

			}
			ch++;
			System.out.println();
		}
	}

}
