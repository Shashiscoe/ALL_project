package package3;

public class Resverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="shwetasalve";
		int len=str.length();
		String rev="";
		
		char arr[]=str.toCharArray();
		char arr1[]=new char[len];
		int j=0;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+arr[i];
			arr1[j]=arr[i];
			j++;
		}
		System.out.println(rev);
		for(int i=0;i<len;i++)
		{
			System.out.print(arr1[i]);
		}
		}

}
