package ListCollectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(20);
		list.add(80);
		System.out.println("Before Sorting "+ list);
		Collections.sort(list);
		
		
		System.out.println("After Sorting in natural order "+list);
		Collections.sort(list,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		System.out.println("After Sorting in Custom order "+list);
		
		
	}

}
