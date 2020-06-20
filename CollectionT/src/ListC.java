import java.awt.List;
import java.util.*;
public class ListC {
	public static void main(String[] args) {
	
		String s="shashikumar";
		HashMap<Character, Integer> str=new HashMap<>();
		char arr[] =s.toCharArray();
		
		
		for(char x:arr)
		{
			int count=1;
			if(str.containsKey(x))
			{
				str.put(x, str.get(x)+1);
			}
			else
			{
				str.put(x, count);
			}
			
		}
		
		Iterator itr=str.keySet().iterator();
		System.out.println(str.values());
		Iterator itr1=str.values().iterator();
		
		//System.out.println(itr1);
		while(itr1.hasNext())
		{
		  System.out.print(itr1.next()); 
		}
		
		String str1="";
		while (itr.hasNext()) {
			
			str1+=itr.next();
			//System.out.print(itr1.next()+ " "); ;
			
		}
		System.out.println(str1);
		
	}

}
