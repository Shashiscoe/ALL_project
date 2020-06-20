package matrix;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		System.out.println("Enter number of row");
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		System.out.println("Enter number of col");
		int col=scan.nextInt();
		
		int m[][]=new int[row][col];
		System.out.println("Enter the number now");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				m[i][j]=scan.nextInt();
			}
		}
		System.out.println("matrix are");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(	m[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i<j)
				{
					int temp=m[i][j];
					m[i][j]=m[j][i];
					m[j][i]=temp;
				}
				
			}
			
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(	m[i][j]+" ");
			}
			System.out.println();
		}
	}

}
