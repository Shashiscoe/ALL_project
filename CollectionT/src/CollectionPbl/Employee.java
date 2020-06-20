package CollectionPbl;

import java.util.ArrayList;

class Employee1 {

	int id;
	String name;
	String address;
	float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public boolean search(ArrayList<Employee1> e,int empid)
	{
		int flag=0;
		for(Employee1 x:e)
		{
			//System.out.println(x.getId());
			if(x.getId()==empid)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
}
public class Employee
{
	public static void main(String[] args) {
	
		Employee1 e=new Employee1();
		e.setId(10);
		e.setName("shashi");
		e.setSalary(5000);
		e.setAddress("india");
		Employee1 e1=new Employee1();
		e1.setId(11);
		e1.setName("shashiKumar");
		e1.setSalary(6000);
		e1.setAddress("pune");
		ArrayList<Employee1> ae=new ArrayList<>();
		ae.add(e);
		ae.add(e1);
		Employee1 obj=new Employee1();
		if(obj.search(ae,10))
		{
			System.out.println("Employee record Found ");
		}
		else
		{
			System.out.println("Employee record Not Found");
		}
	}
}
