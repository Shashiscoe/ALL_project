
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class freqCount {

	public static void main(String[] args) {
	
	HashMap<Character,Integer> t1=new HashMap<>();
	HashMap<Character,Integer> t2=new HashMap<>();
	ArrayList<Character> a=new ArrayList<>();
	System.out.println("Enter the sring");
	int input1=23,input2=765,input3=235,input4=687;

	String str=""+input1+input2+input3+input4;
	
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
	
	int size=t2.size();
	
	System.out.println("maximum count of charcater is : "+t2);
	System.out.println(t2.keySet().toArray());
	
	
	}


}
