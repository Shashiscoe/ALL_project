package package3;
/*
 * 1 1 1 1
 * 2 2 2 2
 * 3 3 3 3
 * 4 4 4 4 
 * 
 * */
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4;j++)
			{
				System.out.print(count+" ");
			}
			System.out.println();
			count++;
		}
	}

}
