package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExm {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		Employee emp=new Employee();
		emp.setEmpId(20027567);
		emp.setName("Shashi Kumar");
		emp.setSalary(4100000);
		emp.setPassword(9874568);
		
		//start of serialization
		System.out.println("Start Serializarion");
		try {
			FileOutputStream fos=new FileOutputStream("emp.ser");
			ObjectOutputStream ofs=new ObjectOutputStream(fos);
			ofs.writeObject(emp);
			ofs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End Serializarion");
		//end of serialization
		System.out.println("=========================");
		System.out.println("Start deserialization");

		//start of Deserialization
		
		
		try {
			FileInputStream fis=new FileInputStream("emp.ser");
			ObjectInputStream ifs=new ObjectInputStream(fis);
			Employee emp1=(Employee)ifs.readObject();
			System.out.println(emp1);
			ifs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End deserialization");
	}

}
