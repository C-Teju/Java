package daemonProcess;

public class CompilingCode extends Thread {
	public void run() {
		
//		Step1-  This is a supporting task so it should be
//		in an infinite loop
		for(;;) {
		System.out.println("Compiling Code");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
