package Comparator;

//implement comparable interface
class Student implements Comparable<Student>
{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){ 
		
		
		
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
}  
	
	@Override  
	public int compareTo(Student st)
	{  
		if(this.rollno==st.rollno)  
			return 0;  
		else if(this.rollno>st.rollno)  
			return 1;  
		else  
			return -1;  
	}  
	
}  