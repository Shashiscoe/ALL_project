package package2;

import java.util.Scanner;

/*Print a number 1-100 without using loop*/
public class PrintNumber {

	void print(int n)
	{
		if(n>0)
		{
			print(n-1);
			System.out.println(n+" ");
			
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		PrintNumber t=new PrintNumber();
		t.print(n);
	}

}
