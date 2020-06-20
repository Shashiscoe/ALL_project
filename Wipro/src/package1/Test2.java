package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> str=new ArrayList<>();
		System.out.println("Enter number");
		for(int i=0;i<10;i++)
		{
			str.add(i);
		}
		System.out.println(str);
		Iterator itr=str.iterator();
		if(str.contains(5))
		{	System.out.println("shgj");
		}
		while(itr.hasNext())
		{
			
			System.out.print(itr.next()+" ");
		}
		
	}
	
}
