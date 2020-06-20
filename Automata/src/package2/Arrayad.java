package package2;

import java.util.Scanner;

public class Arrayad {

	public static void main(String[] args) {
		System.out.println("How many element in array:");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		int a[]=new int[num];
		System.out.println("Enter array:");
		for(int i=0;i<num;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("You enterde:");
		for(int i=0;i<num;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the endex");
		int index=scan.nextInt();
		int ind_rst=num-index;
		int ass[]=new int[index+1];
		int ass1[]=new int[ind_rst];
		
		for(int i=0;i<=index;i++)
		{
			ass[i]=a[i];
		}
		System.out.println("arra B");
		for(int i=0;i<=index;i++)
		{
			System.out.print(ass[i]+" ");
		}
		
		System.out.println();
		for(int i=index+1,j=0;i<num;i++,j++)
		{
			ass1[j]=a[i];
		}
		System.out.println("Array C:");
		for(int i=0;i<num-index-1;i++)
		{
			System.out.print(ass1[i]+" ");
		}
		System.out.println();
		System.out.println("Array B after sorting:");
		
		for(int i=0;i<=index;i++)
		{
			for(int j=i+1;j<=index;j++)
			{
				if(ass[i]>ass[j])
				{
					int temp=ass[i];
					ass[i]=ass[j];
					ass[j]=temp;
				}
			}
		}
		for(int i=0;i<=index;i++)
		{
			System.out.print(ass[i]+" ");
		}
		System.out.println();
		for(int i=0;i<ind_rst;i++)
		{
			for(int j=i+1;j<=index;j++)
			{
				if(ass1[i]<ass1[j])
				{
					int temp=ass1[i];
					ass1[i]=ass1[j];
					ass1[j]=temp;
				}
			}
		}
		System.out.println("Array C after sorting:");
		for(int i=0;i<num-index-1;i++)
		{
			System.out.print(ass1[i]+" ");
		}
		
	}

}
