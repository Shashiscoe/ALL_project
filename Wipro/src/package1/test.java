package package1;

import java.util.Scanner;

class Base
{
	public Base()
	{
		System.out.println("Based class");
	}
}
public class test extends Base{
	public test()
	{
		System.out.println("derived class");
	}

	public static void main(String[] args) {
		/*StringBuffer s=new StringBuffer("97952626");
		System.out.println(s);
		int x=Integer.parseInt(s.toString());
		System.out.println(x);
		int y=Integer.parseInt("12345");
		System.out.println(y);
		String str=s.reverse().toString();
		
		System.out.println(str);
		if(s.equals(str))
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("not");
		}
		*/

		new test();
		
				
	}

}
