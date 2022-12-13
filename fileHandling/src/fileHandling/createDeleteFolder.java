package fileHandling;
import java.util.*;
import java.io.*;
public class createDeleteFolder {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		File file=new File("C:\\Users\\Administrator\\Desktop\\SuriyaLove");//create a foldder
		if(!file.exists()) {
			file.mkdirs();
			System.out.println("Directory created");
		}
		else {
			System.out.println("Already exist:");
			}
		file.delete();//delete folder
	}
}
