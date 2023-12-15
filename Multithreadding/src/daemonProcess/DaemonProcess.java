package daemonProcess;

public class DaemonProcess {
	public static void main(String[] args) {
		TypingCode t1=new TypingCode();
		SavingCode t2=new SavingCode();
		CompilingCode t3=new CompilingCode();
		
//	step2-	since t2 and t3 are supporting tasks setDaemon is true
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
