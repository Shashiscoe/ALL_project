package Singleton;

public class SingletonP {
	private static SingletonP obj=null;
	private SingletonP()
	{
		System.out.println("created");
	}
	private static SingletonP getInstance()
	{
		if(obj==null)
		{
			obj=new SingletonP();
		}
		return obj;
	}
	public static void main(String[] args) {
		
		SingletonP obj1= SingletonP.getInstance();
		SingletonP obj2=SingletonP.getInstance();
		SingletonP obj3=SingletonP.getInstance();
			}

}
