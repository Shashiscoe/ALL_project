class Parent{
	void m1(){
		System.out.println("Parent m1 method");
		
	}
	void m2()
	{
		System.out.println("Parent m2 method");
	}
	
}
class Child1 extends Parent
{
	void m1()
	{
		System.out.println("Child m1 method");
		
	}
	void m3()
	{
		System.out.println("Child m3 method");
	}
}

public class Child 
{
	public static void main(String[] args) {
		
		//Parent p=new Parent();
		Parent p=new Child1();
		Child1 c=new Child1();
		//case 1
		/*Parent refrence can be used to hold child object but using this refrence we can call only parent
		 * specific method..
		 * */
		//c.m1();
		//c.m2();
		//c.m3();
		p.m1();
		//p.m3();
	}
}



