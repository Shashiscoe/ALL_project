package Singleton;

public class SingletonWithSync {
	private static SingletonWithSync obj= null;
	private SingletonWithSync()
	{
		System.out.println("Singleton Object Created" );
	}
	public static synchronized SingletonWithSync getInstance()
	{
		if(obj==null)
		{
			obj=new SingletonWithSync();
		}
		return obj;
	}
	public static void main(String[] args) {
		SingletonWithSync obje1=SingletonWithSync.getInstance();
		SingletonWithSync obje2=SingletonWithSync.getInstance();
		SingletonWithSync obje3=SingletonWithSync.getInstance();
		
		
	}

}
