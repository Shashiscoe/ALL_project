import java.util.Scanner;

public class TestFact {

		public static void main(String[] args) {
		
			int input,fact=1;
			Scanner scan=new Scanner(System.in);
			input=scan.nextInt();
			while(input>0)
			{
				fact=fact*input;
				input-=1;
			}
			System.out.println(fact);
			String str=""+fact;
			char arr[]=str.toCharArray();
			
			int len=arr.length;
			int count=0;
			for(int i=len-1;i>0;i--)
			{
				if(arr[i]=='0')
				{
					count=count+1;
				}
				else
				{
					break;
				}
			}
			System.out.println(count);
		}
}
