package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdLrage{

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(1);
		list.add(67);
		list.add(67);
		list.add(10);
		list.add(92);
		
		List<Integer> list1=new ArrayList<>();
		
		list1.addAll(list);
		Collections.sort(list);
		int thirdLargest=list1.get(list.size()-2);

		System.out.println(list);
		System.out.println(list1);
		int index=0;
		
		for(int i=0;i<list.size();i++)
		{
			if(list1.get(i)==thirdLargest)
			{
				index=i;
				break;
			}
		}
		System.out.println(index);
		
	}

}
