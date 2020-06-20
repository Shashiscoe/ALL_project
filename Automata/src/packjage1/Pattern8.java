package packjage1;

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
public class Pattern8 {

	public static void main(String[] args) {
	System.out.println("Enter number of row:  ");
	Scanner scan=new Scanner(System.in);
	char ch='A';
	int n=scan.nextInt();
	for(int i=0;i<n;i++)
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
