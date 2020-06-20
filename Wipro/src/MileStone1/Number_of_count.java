package MileStone1;

import java.util.Scanner;

public class Number_of_count {

	
	int freq(int arr[],int x,int i)
	{
		int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(x==arr[j] && arr[j]!=-1)
				{
					count++;
					arr[j]=-1;
				}
			}
			
		
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println("How many number you want to enter:");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int arr[]=new int[num];
		Number_of_count t=new Number_of_count();
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<num;i++)
		{
			
			int y=t.freq(arr, arr[i],i);
			
			if(arr[i]!=-1)
			{
			
				System.out.println(arr[i]+" = "+y);
			}
		}
		

	}
	

}
