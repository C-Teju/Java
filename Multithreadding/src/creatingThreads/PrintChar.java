package creatingThreads;

public class PrintChar extends Thread {
	public void run() {
		for(int i=65;i<=74;i++)
		{
			System.out.print((char)(i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
