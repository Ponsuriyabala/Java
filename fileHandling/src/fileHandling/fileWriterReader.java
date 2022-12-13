package fileHandling;
import java.io.*;
public class fileWriterReader {
	public static void main(String args[]) throws IOException {
		File createfile=new File("C:\\Users\\Administrator\\Desktop\\Suriya\\detail.txt");
		FileWriter fw=new FileWriter(createfile);
		fw.write("new text");
//		fw.flush();
		//is used to refresh the object(fw)
		fw.write(" next text");
//		fw.flush();
		fw.close();
//		------------------------------------------------
		FileReader fr=new FileReader(createfile);
		int value=fr.read();//  get it by single character if no charatr there return -1
		while(value!=-1) {
			System.out.print((char)value);
			value=fr.read();
		}
	}
}
