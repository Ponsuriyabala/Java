package fileHandling;

import java.io.*;

public class fileBufferWriterReaderr {
	public static void main(String args[]) throws IOException {
		File createfile=new File("C:\\Users\\Administrator\\Desktop\\Suriya\\mydetail.txt");
		FileWriter fw=new FileWriter(createfile,true);
		BufferedWriter bw=new BufferedWriter(fw);
		fw.append("\nwhole datakjkkh");
		//fw.
		//fw.append("/njack");
		fw.close();
//		------------------------------------------
		FileReader fr=new FileReader(createfile);
		BufferedReader br=new BufferedReader(fr);
		String str=br.readLine();
		while(str!=null) {
			System.out.println(str);
			str=br.readLine();
		}
	}
}
