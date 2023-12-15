package MyThread;

public class MyThread extends Thread{
	@Override
	public void run() {
		Thread t1=Thread.currentThread();
		System.out.println(t1);
	}
}
