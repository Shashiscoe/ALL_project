package package2;

import java.util.HashMap;
import java.util.Scanner;

public class Collrction1 {

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner scan =new Scanner(System.in);
		String str=scan.next();
		char []arr=str.toCharArray();
		HashMap<Character, Integer> t=new HashMap<>();
		for(char ch:arr)
		{
			int count=1;
			if(t.containsKey(ch))
			{
				t.put(ch,t.get(ch)+1);
				
			}
			else
			{
				t.put(ch,count);
			}
		}
		System.out.println(t);
	}

}
