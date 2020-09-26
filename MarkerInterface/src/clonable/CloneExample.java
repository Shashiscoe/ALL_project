package clonable;

class Employee implements Cloneable {
	 int empId;
	private String name;
	private int salary = 874555;
	private transient int password;
	

	public Employee(int empId, String name, int salary, int password) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", password=" + password + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneExample {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Shashi Kumar", 9874562, 789456);
		Employee emp1=null;

	
		try {
			 emp1 = (Employee) emp.clone();
			emp1.empId=102;
			
	
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		System.out.println("Clone object " + emp1);
		System.out.println("Original object "+emp);
		

	}

}
