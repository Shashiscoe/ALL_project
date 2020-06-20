import java.util.*;
import java.util.stream.Collector;

public class ArrayList1 {
public static void main(String[] args) {
	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	  list.add("Ravi");//Adding object in arraylist  
	  list.add("Vijay");  
	  list.add("JDG");  
	  list.add("Ajay"); 
	  list.add("Ravi");
	   
	  System.out.println("Before");
	  list.forEach(i->System.out.print(i+" "));
	  //list.stream().filter(s->s.compareTo("Vijay")).collect();
	  System.out.println();
	  System.out.println("Removing duplicate from ArrayList");
	  LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
	  linkedHashSet.addAll(list);
	  
	  System.out.println(linkedHashSet);
	
	  Collections.reverse(list);
	  System.out.println(list);
	  
	 /* if(list.contains("Ravi"))
	  {
		  System.out.println("found");
	  }
	*/  //System.out.println(a);
	  int len =list.size();
	  Iterator itr=list.iterator();
	  /*System.out.println("List contain data");
	  System.out.println("index of Ajay :"+list.indexOf("Ajay"));
	  System.out.println(list.get(2));
	  */
	/*  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
		  
	  }
	*/  
	  //Traversing list through Iterator  
//	  Iterator itr=list.iterator();  
//	  while(itr.hasNext()){  
//	   System.out.println(itr.next());  
//	  

}
}
