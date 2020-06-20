class MyThread1 implements Runnable 
{

	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}	
public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		Thread t1=new Thread(t);
		t1.start();
	}

}
