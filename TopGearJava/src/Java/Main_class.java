package Java;

import java.util.Scanner;

class Employee
{
	
	int id;
	String name;
	String address;
	double salary;
	
public Employee(int id, String name, String add, double sal) {
		this.id=id;
		this.address=add;
		this.name=name;
		this.salary=sal;
	}
}
public class Main_class {

	public static void main(String[] args) {
		Employee arr[]=new Employee[10];
		System.out.println("Enter number of employee:");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("Enter the employee details:");
		System.out.println();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the name");
			String name=scan.next();
			System.out.println("ID");
			int id=scan.nextInt();
			System.out.println("Address");
			String add=scan.next();
			System.out.println("salary");
			double sal=scan.nextDouble();
			arr[i]=new Employee(id,name,add,sal);

		}
		System.out.println("Enter Id of employee you want to search:");
		int id1=scan.nextInt();
		System.out.println("Enter name of employee you want to search:");
		String name1=scan.next();
		int flag=0;
		for(int i=0;i<num;i++)
		{
			if(arr[i].id==id1 && arr[i].name.equals(name1))
			{
				flag=1;
				System.out.println("Employee record found:");
				System.out.println(arr[i].id+"   "+arr[i].name+"   "+arr[i].address+"   "+arr[i].salary);
			}
			
		}
		if(flag==0)
		{
			System.out.println("Employee record  not found:");
		}
		
				System.out.println();
	}

}
