package Interface;

interface Student1 {
	
	int id=45;
	String name="khdk";
	int age=12;
	public void display();

}

class StudentImpl implements Student1
{
	int roll;
	
	public StudentImpl(int id,String name,int age,int roll)
	{
		this.roll=roll;	
	
	}
	
	public void display() {
		
		System.out.println("ID ="+id+ "  Name="+name+ " Age="+age+ " Roll="+ roll);
		
	}
	
}

public class MainClassTest
{
	public static void main(String[] args) {
	
		StudentImpl s1=new StudentImpl(12, "shweta", 24, 60);
		s1.display();
		
	}
}
