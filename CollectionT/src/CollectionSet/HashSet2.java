package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
	
		
		HashSet<String> t1=new HashSet<>();
		t1.add("shashi");
		t1.add("kumar");
		t1.add("kant");
		Iterator<String> itr=t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
