package TreeMap;

import java.util.TreeMap;
//By default tree map sort by key in ascending order
public class TreeMapBasic1 {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> t1=new TreeMap<>();
		t1.put(109, "Shashi");
		t1.put(101, "Ravi");
		t1.put(105, "kumar");
		System.out.println(t1);
	
		TreeMap<String, String> t2=new TreeMap<>();
		t2.put("city", "sasaram");
		t2.put("state", "bihar");
		t2.put("country", "india");
		System.out.println(t2);
		
	}

}
