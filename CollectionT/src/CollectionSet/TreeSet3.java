package CollectionSet;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet<String>();
		
		t.add("one");
		t.add("two");
		t.add("three");
		t.add("four");
		t.add("five");
		//System.out.println(t.descendingIterator().next().toString());
		Iterator<String> itr=t.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		
		}
	}

}
