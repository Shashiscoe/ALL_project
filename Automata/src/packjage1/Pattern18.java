package packjage1;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		System.out.println("Enter number of row:  ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num;
		for(int row=1;row<=n;row++)
		{
			num=row;
			for(int i=1;i<=row;i++)
			{
				System.out.print(num);
				num=num+n-i;
			}
			System.out.println();
			
		}
	}

}

