package package3;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=5;
		for (int i=1;i<=count;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			
		}
		for(int i=count-1;i>=1;i--){
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
