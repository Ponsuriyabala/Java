package fileHandling;

import java.io.File;
import java.util.Scanner;

public class reNameAndDirectoryaddress {
	public static void main(String args[])throws Exception {
		Scanner in=new Scanner(System.in);
		File file=new File("C:\\Users\\Administrator\\Desktop\\Suriya");//create a folder
		if(!file.exists()) {
			file.mkdirs();
			System.out.println("Directory created");
		}
		else {
			System.out.println("Already exist:");
			}
		File createfile=new File("C:\\Users\\Administrator\\Desktop\\Suriya\\detail.txt");//create a file
		createfile.createNewFile();


		
		File createrenamefile=new File("C:\\Users\\Administrator\\Desktop\\Suriya\\mydetail.txt");//create a file
		createrenamefile.createNewFile();
		boolean present=createfile.renameTo(createrenamefile);
		if(present)
			System.out.println("Rename Successfully");
		createfile.delete();
//		-----------------------------------------------------------
		System.out.println(createrenamefile.getName());
		System.out.println(createrenamefile);
	}
}
