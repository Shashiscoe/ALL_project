package package1;

public class Test {
	public static void main(String[] args) {
		String x = "agetihodu";
		x.toLowerCase();
		String str="";
		String v="aeiou";
		char arr[]=x.toCharArray();
		int j=0;
		for(char ch:arr)
		{
			if(v.charAt(j)==ch)
			{
				j++;
				str+=ch;
			}
		}
		if(v.equals(str))
		{
			System.out.println("In Order");
		}
		else
		{
			System.out.println("Not order");
		}		
		}
}
