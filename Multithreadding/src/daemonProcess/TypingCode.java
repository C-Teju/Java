package daemonProcess;

public class TypingCode extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
		System.out.println("Typing Code");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
