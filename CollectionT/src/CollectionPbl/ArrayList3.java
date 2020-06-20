package CollectionPbl;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public void printAll(ArrayList<String> e)
	{
		Iterator< String> itr=e.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> e=new ArrayList<>();
		e.add("shashi");
		e.add("shashi1");
		
		e.add("shashi2");
		
		e.add("shashi3");
		
		e.add("shashi4");
		ArrayList3 obj=new ArrayList3();
		obj.printAll(e);
		
		

	}

}
