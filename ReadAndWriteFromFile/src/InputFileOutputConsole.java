import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputFileOutputConsole {

	public static void main(String[] args) {
		String path1= "D:\\FileInputOutput\\ABC.txt";
		String path2= "D:\\FileInputOutput\\output.txt";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		int x=sc.nextInt();
		
		try {
			
			
			FileReader fr = new FileReader(path1);
			BufferedReader br =new BufferedReader(fr);
			
				bw.write(x);
				bw.close();
				br.close();
				fr.close();
			}
		}
		
		
	}

}
