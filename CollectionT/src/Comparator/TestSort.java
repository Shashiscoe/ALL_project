/*
 * Java Comparable interface is used to order the objects of the user-defined class.
 *  This interface is found in java.lang package and contains only one method named compareTo(Object).
 *  It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single
 *  data member only.
 *  For example, it may be rollno, name, age or anything else.*/
package Comparator;

import java.util.*;

public class TestSort {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
