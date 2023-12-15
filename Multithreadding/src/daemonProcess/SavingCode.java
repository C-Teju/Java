package daemonProcess;

public class SavingCode extends Thread {
	public void run() {

		
//		Step1-  This is a supporting task so it should be
//		in an infinite loop
		for(;;) {
		System.out.println("Saving Code");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  }
}

