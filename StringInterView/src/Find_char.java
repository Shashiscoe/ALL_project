import java.util.HashMap;
import java.util.Scanner;

public class Find_char {

	public static void main(String[] args) {
	
	HashMap<Character,Integer> t1=new HashMap<>();
	HashMap<Character,Integer> t2=new HashMap<>();
	System.out.println("Enter the sring");
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	char arr[]=str.toCharArray();
	for(char ch:arr)
	{
		int count=1;
		if(t1.containsKey(ch))
		{
			t1.put(ch,t1.get(ch)+1);
		}
		else
		{
			t1.put(ch,count);
		}
	}
	System.out.println("You entered:");
	System.out.println(t1);
	int max=0;
	char ch1=' '; 
	for(char ch:arr)
	{
		int temp=t1.get(ch);
		
		if(temp>=max)
		{
			max=temp;
			ch1=ch;
			t2.put(ch1, max);
		}
	}
	System.out.println("maximum count of charcater is : "+t2);
	
	}
}
