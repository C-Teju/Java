package joinMethod;

public class Chatting extends Thread {
	public void run() {
		try {
			System.out.println("Chtting started");
			Thread.sleep(2000);
			System.out.println("Chtting continues");
			Thread.sleep(2000);
			System.out.println("Chtting stopped");
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
