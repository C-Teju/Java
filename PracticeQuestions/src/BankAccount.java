import java.util.Scanner;

public class BankAccount {
	private long accno;
	private String name;
	
	public BankAccount(long accno, String name) {
		super();
		this.accno = accno;
		this.name = name;
	}
	public long getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long an=sc.nextLong();
		sc.nextLine();
		String ana=sc.nextLine();
		
		BankAccount ba=new BankAccount(an,ana);
		System.out.println("Account Number: "+ba.getAccno());
		System.out.println("Account Holder Name: "+ ba.getName());
	}
	

}
