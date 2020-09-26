package VerifyConcept;

class Employee
{
	private static int empId;
	private static String empName;
	//We can not make constructor as final ,only public,protected and private modifier are applicable with constructor
	//we can't override static method
	//we can't make constructor static
	//we can't make abstract method static ,as abtract method must override but we can't override static method
	//we can declare the static variables and methods in an abstract class
	public  Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public static void display()
	{
		System.out.println("EmpID :"+empId +" Name :"+empName);
	}
	
	
}

public class Test extends Employee {
	
	public Test(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}
	public static void display()
	{
		System.out.println("EmpID :");
	}
	public static void main(String[] args) {
		Employee e1=new Employee(101, "Shashi");
		Employee e2=new Employee(102, "Shweta");
		Employee e3=new Test(103, "Kumar");
		Employee.display();
		e3.display();
	}
}
