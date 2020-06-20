package package3;

public class CountVowelConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="shwetasalve";
		char arr[]=str.toCharArray();
		int v=0;
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o'||arr[i]=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("vowel: "+v);
		System.out.println("con :"+c);
	}

}
