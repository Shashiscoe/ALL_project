import java.util.Scanner;

public class Patter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=1;
		for(int i=0;i<n;i++)
		{
			if(i==1)
			{
				int count1=count+n;
				for(int j=0;j<n;j++)
				{
					System.out.print(count1);
					count1++;
					if(j<n-1)
					{
						System.out.print("*");
					}
				}
				System.out.println();
			}
			else
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(count);
					count++;
					if(j<n-1)
					{
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
		
		}

	}

}
