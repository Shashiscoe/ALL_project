import java.io.Serializable;

public class Employee implements Serializable {


	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	private static int  salary=900;

/*
 * Since password is a transient variable, it’s value was not saved to file and hence not retrieved in the new object.
 *  Similarly static variable values are also not serialized since they belongs to class and not object.*/
	private transient String password;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", password=" + password + "]";
	}

	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

