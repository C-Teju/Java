import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderReadAndWrite {

	public static void main(String[] args) {
		try {
			String path1="D:\\FileInputOutput\\ABC.txt";
			String path2="D:\\FileInputOutput\\output.txt";
			FileReader fr=new FileReader(path1);
			FileWriter fw=new FileWriter(path2);
			int x;
			while((x=fr.read())!=-1) {
				fw.write(x);
			}
			
			fr.close();
			fw.close();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	
	}

}
