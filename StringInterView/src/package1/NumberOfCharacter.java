package package1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;

public class NumberOfCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		char str[]=a.toCharArray();
		
		HashMap<Character, Integer> t1=new HashMap<>();
		for(char ch:str)
		{
			int count=1;
			if(t1.containsKey(ch))
			{
				t1.put(ch, t1.get(ch)+1);
			}
			else
			{
				t1.put(ch, count);
			}
		}
		System.out.println(t1);
		System.out.println();
		Collection<Integer> val=t1.values();
		ArrayList<Integer> value=new ArrayList<Integer>(val);
		for(int x:value)
		{
			System.out.print(x+" ");
		}
		
	}

}
