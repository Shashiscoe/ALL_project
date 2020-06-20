
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread()+ "Child thread is running");
		}
	}
}
public class ThreadDemo
{
	public static void main(String arg[])
	{
		MyThread t1=new MyThread();
		t1.start();
		t1.setName("Thraed");
	}
}
