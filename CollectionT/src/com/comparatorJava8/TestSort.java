package com.comparatorJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSort {

	public static void main(String args[]){  
		  
		
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
	
		System.out.println("Before");
		for(Student s:al)
		{
			System.out.println(s.rollno + "  "+s.name+"  " + s.age);
		}
		
		System.out.println();
		System.out.println("Sorting by Name"); 
		Comparator<Student> cmp1=Comparator.comparing(Student::getName);
		Collections.sort(al,cmp1);
		for(Student s:al)
		{
			System.out.println(s.rollno + "  "+s.name+"  " + s.age);
		}
		
		System.out.println();
		System.out.println("Sort By age");
		Comparator<Student> cmp2=Comparator.comparing(Student::getAge);
		Collections.sort(al,cmp2);
		for(Student s:al)
		{
			System.out.println(s.rollno + "  "+s.name+"  " + s.age);
		}
		
	}
	
}
