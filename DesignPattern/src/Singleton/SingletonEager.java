package Singleton;

public class SingletonEager {

	private static  SingletonEager obj=new SingletonEager();
	public SingletonEager()
	{
		System.out.println("Eager Instance created");
	}
	  public static SingletonEager getInstance() 
	    { 
	        return obj; 
	    } 
	public static void main(String[] args) {
	
		SingletonEager.getInstance();

		SingletonEager.getInstance();
		SingletonEager.getInstance();

	}

}
