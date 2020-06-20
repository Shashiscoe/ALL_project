package packjage1;

import java.util.Scanner;
/*
 * Enter number:
5
1
22
333
4444
55555*/

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
