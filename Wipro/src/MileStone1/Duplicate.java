package MileStone1;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many number you want to enter:");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int arr[]=new int[num];
		int arr1[]=new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int count=0;
		for(int i=0;i<num;i++)
		{
			int x=arr[i];
			for(int j=i+1;j<num;j++)
			{
				if(arr[j]==x)
				{
					arr[j]=0;
					count++;
				}
			}
		}
		int k=0;
		System.out.println();
		for(int i=0;i<num;i++)
		{
			if(arr[i]==0)
			{
				
			}else
			{
			arr1[k]=arr[i];
			}
		}
		for(int i=0;i<num-count+1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
