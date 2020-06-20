package package1;

public class Substring {

	public static void main(String[] args) {
		
		String str="abcd";
		int len=str.length();
		//System.out.println(str.substring(0,4));
		substring(str,len);

	}

	private static void substring(String str, int n) {
		
		for(int i=0;i<n;i++ )
		{
			for(int j=i+1;j<=n;j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
		
	}

}
