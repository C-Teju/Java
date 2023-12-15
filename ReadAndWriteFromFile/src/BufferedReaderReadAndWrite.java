import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderReadAndWrite {

	public static void main(String[] args) {
		try {
			String path1 = "D:\\FileInputOutput\\ABC.txt";
			String path2 = "D:\\FileInputOutput\\output.txt";
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);
			int x;
			while ((x = br.read()) != -1) {
				bw.write(x);
			}
			bw.flush();
			br.close();
			bw.close();
			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
