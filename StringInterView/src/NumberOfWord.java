import java.util.StringTokenizer;

public class NumberOfWord {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Honesty is best policy");
		int count =0;
		while(st.hasMoreTokens())
		{
			count++;
			System.out.println(st.nextToken());
		}
		System.out.println("Number of word is  :"+count);
	
	
	//method 2
	String str="Honesty is best policy";
	String strArray[]=str.split(" ");
	int len=strArray.length;
	System.out.println("Number of word is  :" +len);
	
	//using for loop
	char charArray[]=str.toCharArray();
	int count1=0;
	int count2=0;
	System.out.println("length ="+charArray.length);
	for (int i=charArray.length-1;i>=0;i--) {
		count1++;
		if(charArray[i]==' ')
		{
			count2=count1+count2;
			System.out.println(count2);
			for(int j=charArray.length-count2;j<charArray.length;j++)
			{
				System.out.print(charArray[j]);//System.out.print(charArray[j]);
			}
			count1=0;
		}
		
		
	}
	}
	

}
