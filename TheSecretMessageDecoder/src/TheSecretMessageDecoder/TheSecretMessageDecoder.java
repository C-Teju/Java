package TheSecretMessageDecoder;

import java.util.Scanner;

public class TheSecretMessageDecoder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a char");
		char ch=scan.next().charAt(0);
		Decoder d=new Decoder();
		System.out.println(d.decodeCharacter(ch));
		scan.close();

	}
	//Question
	

}
