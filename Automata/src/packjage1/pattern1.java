package packjage1;

import java.util.*;
/*
 * Enter number:
5
1
3*2
4*5*6

10*9*8*7
11*12*13*14*15*/
public class pattern1 {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=1;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print(count);
					count++;
					if(i!=j)
					{
						System.out.print("*");
					}
				}
				System.out.println();
			}
			else
			{
				int count1=count+i;
				for(int j=0;j<=i;j++)
				{
					System.out.print(count1);
					count1--;
					count++;
					if(i!=j)
					{
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
		}
	}

}
