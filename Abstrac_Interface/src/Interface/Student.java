package Interface;

interface Stud
{
	public void m1();
}
interface Stud1
{
	public void m1();
}

interface studImpl extends Stud1,Stud
{
	public void m3();
}
public class Student implements studImpl {

	public void m1()
	{
		System.out.println("Implementaion of m1");
	}
	public void m3()
	{
		System.out.println("Imm m3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.m1();
		s.m3();	
	}

}
