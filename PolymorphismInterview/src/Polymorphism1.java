class Parent
{
	public void method1()
	{
		System.out.println("I am in parent class method1");
	}
	protected void method2()
	{

		System.out.println("I am in Parent class method2");
	}
	public void method4()
	{
		System.out.println("I am in Parent class method4");

	}
}

class Child extends Parent
{
	//Error-Cannot reduce the visibility of the inherited method from Parent
/*	protected void method1()
	{

		System.out.println("I am in Child class");
	}
*/	
	public void method1()
	{

		System.out.println("I am in Child class Method1");
	}

	public void method2()
	{
		System.out.println("I am in child class method2");

	}
	public void method3()
	{
		System.out.println("I am in child class method 3");

	}
	
}

public class Polymorphism1 {

	public static void main(String[] args) {
	
		System.out.println("-------------------parent ref and parent object-----------");
		Parent p=new Parent();
		p.method1();
		p.method2();
		p.method4();

		
		System.out.println("..............Parent ref and Child object............");
		Parent p1=new Child();
		p1.method1();
		p1.method2();
		p1.method4();
		
		System.out.println("-------------------Child ref and child object-----------");
		
		Child c=new Child();
		c.method1();
		c.method2();
		c.method3();
		
	}

}
