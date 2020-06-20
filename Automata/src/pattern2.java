//diamod shape

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int cnt=5;
		int c=0;
		for(int j=1;j<=n;j++)
		{
			for(int p=cnt-c;p>0;p--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<j;k++)
			{
				System.out.print("*");
				c=k;
			}
			System.out.println();
		}
		
	}

}
