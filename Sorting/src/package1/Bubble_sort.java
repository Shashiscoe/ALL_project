package package1;
//Bubble sort
import java.util.Scanner;

public class Bubble_sort {

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
		Bubble_sort s=new Bubble_sort();
		System.out.println("Array Before sorting:");
		s.display(arr,num);
		System.out.println("Array After sorting :");
		s.bubble_sort(arr,num);
		s.display(arr,num);
	}

	void bubble_sort(int[] arr,int num)
	{
		Bubble_sort s=new Bubble_sort();
		for(int i=0;i<num;i++)
		{
			System.out.println();
			System.out.println("Pass :"+(i+1));
			
			for(int j=0;j<num-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				s.display(arr, num);
			}
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
