
import java.util.*;
public class Vector_test {
	public static void main(String[] args) {
		Vector<String> v =new Vector<>(18);
		v.add("shashi");
		v.add("kumar");
		v.add("shweta");
		v.add("salve");
		v.add("rohan");
		v.add("kumar");
		v.add("shashi");
		v.add("shashi");
		v.add("shashi");
//		Iterator<String> itr=v.iterator();
		Vector<String> v1 =new Vector<>();
		v1.add("jgsjfk");
		v1.add("aaaa");
		v1.add("dkkkkkk");
		System.out.println(v);
		System.out.println(v1);
		v.addAll(v1);
		System.out.println(v);
		Iterator<String> itr=v.iterator();
		System.out.println(v.size());
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
