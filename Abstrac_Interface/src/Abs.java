//Either directly or indirectly we can't create object of obstract class
abstract class Person
{
	String name;
	int age;
	abstract void display();
	public void m1()
	{
		System.out.println("Non -Abstract Method");
	}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class Student extends Person
{
	int rno;
	int marks;
	
	Student(String name ,int age,int rno,int marks)
	{
		super(name, marks);
		this.name=name;
		this.age=age;
		this.marks=marks;
		this.rno=rno;
	}
	void display() {
		System.out.println("I am implementation of abstract class display method");
	}
		
}
public class Abs {

	public static void main(String[] args) {
		//Person p1 =new Person();   
		//we cant create object of abstract class 
		Student s1= new Student("shashi",23,60, 90);
		System.out.println(s1.name+" "+s1.age+" "+ s1.rno+" "+ s1.marks);
		s1.display();
		s1.m1();
	}

}
