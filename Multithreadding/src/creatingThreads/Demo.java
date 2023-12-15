package creatingThreads;

public class Demo {

	public static void main(String[] args) {
		//thread 1 = main thread
		for(int i=0;i<10;i++)
		{
			System.out.println("main()");
		}
		PrintNum t1=new PrintNum();
		t1.start();
//		new thread for t1 starts
//		total thread =2
		PrintChar t2=new PrintChar();
		t2.start();
//		new thread for t2 starts
//		total thread =3
	}

}
