package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
	
	public static String populate(Employee emp)
	{
			String str=emp.getEmpId()+","+emp.getEmpName()+","+emp.getEmpAddress();			
	

		return str;
	}
	public  static void insertInDB(String parameter)
	{
		System.out.println(parameter +" INSERTED");
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEmpId(100);
		e.setEmpName("Shashi");
		e.setEmpAddress("Pune");

		Employee e1=new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Shweta");
		e1.setEmpAddress("Pune");
		
		Queue<Employee> queue=new ArrayDeque<Employee>();
		queue.add(e);
		queue.add(e1);
		int size=queue.size();
		for(Employee emp:queue)
		{
			String parameter=QueueImplementation.populate(emp);
			QueueImplementation.insertInDB(parameter);	
			queue.remove();
		}
		System.out.println(queue);
		
	}
	
	

}
