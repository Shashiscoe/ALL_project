
class Parent
{
	String name;
	int age;
	Parent(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class Child extends Parent
{
	int rollno;
	int marks;
	Child(String name,int age,int rno,int marks)
	{
		super(name,age);
		this.rollno=rno;
		this.marks=marks;
	}
}
public class Parent_child_cons {

	public static void main(String[] args) {
		Child c1=new Child("shashi",21,60,90);
		System.out.println(c1.name+" "+c1.age+" "+c1.rollno+" "+c1.marks);
	}

}
//whenever we create child object parent constructor are executed but parent object is not createds
//in above program both parent and child constructor are executed for child object initialization only
//