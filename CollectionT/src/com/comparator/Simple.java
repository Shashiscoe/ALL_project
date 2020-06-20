package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Simple {
	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");
		System.out.println();
		Collections.sort(al, new NameComparator());

		al.forEach(i->System.out.println(i));
		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		al.forEach(i->System.out.println(i));
		
		

	}
}