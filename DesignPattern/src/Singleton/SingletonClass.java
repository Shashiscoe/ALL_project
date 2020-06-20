package Singleton;

/*Here we have declared getInstance() static so that we can call it without instantiating the class.
 *  The first time getInstance() is called it creates a new singleton object and after that it just 
 *  returns the same object. Note that Singleton obj is not created until we need it and call getInstance()
 *   method. This is called lazy instantiation.*/
/*This execution sequence creates two objects for singleton. Therefore this classic implementation
 *  is not thread safe.*/ 
public class SingletonClass {
	private static SingletonClass obj= null;
	private SingletonClass()
	{
		System.out.println("Singleton Object Created" );
	}
	public static SingletonClass getInstance()
	{
		if(obj==null)
		{
			obj=new SingletonClass();
		}
		return obj;
	}
	public static void main(String[] args) {
		SingletonClass obje1=SingletonClass.getInstance();
		SingletonClass obje2=SingletonClass.getInstance();
		SingletonClass obje3=SingletonClass.getInstance();
		
		
	}

}


