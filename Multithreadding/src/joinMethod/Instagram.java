package joinMethod;

public class Instagram {

	public static void main(String[] args) {
		System.out.println("Instagram application started");
		Chatting c= new Chatting();
		Reels r=new Reels();
		r.start();
		c.start();
		try {
			r.join();
			c.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Instagram application stopped");
	}

}
