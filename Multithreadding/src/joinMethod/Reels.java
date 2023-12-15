package joinMethod;

public class Reels extends Thread {
	public void run() {
		try {
			System.out.println("Create reels");
			Thread.sleep(2000);
			System.out.println("Post reels");
			Thread.sleep(2000);
			System.out.println("Share reels");
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
