package HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapSimple {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "shashi");
		map.put(3, "xyz");
		map.put(1,"kumar");
		
		System.out.println(map.size());
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("xyz"));
		System.out.println(map);
		
		
		System.out.println("----------Method 1 to iterate--------------");
		System.out.println();
		for(int key:map.keySet())
		{
			
			System.out.println("Key is :"+key+"  value is :"+map.get(key));
		}
		System.out.println("--------------------");
		
		System.out.println("Method 2 to iterate");
		
		
		
		for(Map.Entry<Integer, String> e:map.entrySet())
		{
			System.out.println("Key is :"+e.getKey()+"  "+" Value is:"+e.getValue());
		}
		
		System.out.println("Method 3");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		
		System.out.println();
		System.out.println("Method 4 Using Iterator:");
		
		Iterator<Entry<Integer, String>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
		System.out.println("Using forEach method");
		
		map.forEach((k,v) ->System.out.println(k+"  "+v));
	}

}
