

public class StringBuffer1 {

	public static void main(String[] args) {
		//once we create string object we can not perform any type of changes in existing object
		String s=new String("shashi");
		s.concat("kumar");
		System.out.println(s);
		String s2=new String("shashi");
		//"==" method for refrence/address comparision whereas .equals() method for content comparision
		if(s==s2)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		if(s.equals(s2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		
		
		//but in stringBuffer we can perform any type of changes in existing object 
		
		StringBuffer s1=new StringBuffer("Shashi");
		s1.append("kumar");
		System.out.println(s1);


	}

}
