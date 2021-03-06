package HashMap;

import java.util.HashMap;
//if we not override any of equal or hashMap method then two object will be created.
//if we override equal and hashcode method then if object are same ,only one object will be created

class Employee {
	private String emp_Name;
	private int emp_Id;
	private float emp_salary;

	public Employee(String name, int id, float salary) {
		this.emp_Name = name;
		this.emp_Id = id;
		this.emp_salary = salary;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_Name=" + emp_Name + ", emp_Id=" + emp_Id + ", emp_salary=" + emp_salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + emp_Id;
		result = prime * result + ((emp_Name == null) ? 0 : emp_Name.hashCode());
		result = prime * result + Float.floatToIntBits(emp_salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emp_Id != other.emp_Id)
			return false;
		if (emp_Name == null) {
			if (other.emp_Name != null)
				return false;
		} else if (!emp_Name.equals(other.emp_Name))
			return false;
		if (Float.floatToIntBits(emp_salary) != Float.floatToIntBits(other.emp_salary))
			return false;
		return true;
	}
}

public class HashMapComprator {

	public static void main(String[] args) {
		Object.class.hashCode();
		HashMap<Employee, Integer> map = new HashMap<>();
		Employee emp1 = new Employee("shashi", 123, 50000);
		System.out.println(emp1.hashCode());
		Employee emp2 = new Employee("shashi", 123, 50000);
		System.out.println(emp2.hashCode());
		map.put(emp1, 1);
		map.put(emp2, 1);
		System.out.println(map);

	}

}
