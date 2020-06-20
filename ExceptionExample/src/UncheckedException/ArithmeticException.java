package UncheckedException;

public class ArithmeticException {

	public static void main(String[] args) {
		
		int x=100;
		int y=0;
		
		try
		{
			//System.out.println("I am in try block");
			int result=x/y;
						
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
	
		
	/*	
		String str1="abc";
		int x1=Integer.parseInt(str1);
		System.out.println(x1);
		*/
	

	}

}
