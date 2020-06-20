package package1;
//Selection sort
import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		System.out.println("Enter  the number of element to sort:" );
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("enter the number");
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		Selection_Sort s=new Selection_Sort();
		System.out.println("Array Before sorting:");
		s.display(arr,num);
		System.out.println("Array after sorting :");
		s.selection_sort(arr, num);
		s.display(arr, num);
				

	}
	void selection_sort(int arr[],int num)
	{
		for(int i=0;i<num;i++)
		{
			int min=i;//let first index as index with with minimum element
			for(int j=i+1;j<num;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	
	void display(int []arr,int num)
	{
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
