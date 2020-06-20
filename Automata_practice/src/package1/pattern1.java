package package1;
import java.util.Scanner;

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
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int num=scan.nextInt();
		int count=1;
		
		for(int i=0;i<num;i++)
		{
			
				if(i%2==0)
				{
					for(int j=0;j<=i;j++)
					{
					System.out.print(count);
					if(i!=j)
					{
						System.out.print("*");
					}
					count++;
					}
				
				}
				else
				{
					int count1=count+i;
					for(int j=0;j<=i;j++)
					{
						
					System.out.print(count1);
					if(i!=j)
					{
						System.out.print("*");
					}
					count1--;
					count++;

					
				}
			}
			System.out.println();
		}

	}

}
