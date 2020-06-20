package packjage1;

import java.util.Scanner;
/*
 * for n=3
the program should print
1 1 1 2
3 2 2 2
3 3 3 4
 */
 
public class pattern2 {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print((i+1)+" ");
				}
				System.out.print((i+2));
				System.out.println();
			}
			else{
				System.out.print((i+2)+" ");
				for(int j=0;j<n;j++)
				{
					System.out.print((i+1)+" ");
				}
				System.out.println();
			}
		}

	}

}
