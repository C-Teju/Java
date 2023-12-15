package usingOneRunMethod;

public class ThreadDemo {

	public static void main(String[] args) {
//		create two new thread objects
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();

//		set names for each object
		t1.setName("numbers");
		t2.setName("characters");
		
//		create threads		
		t1.start();
		t2.start();
	}

}
