package fileHandling;

import java.io.File;

public class returnFolderfilesAndseparateFileNFolder {
	public static void main(String args[]) {
		File file=new File("C:\\Users\\Administrator");
		String A[]=file.list();//return all folder from directory
		for(String a:A) {
			System.out.println(a);
		}
		File[] f=file.listFiles();
		for(File out : f) {
			if(out.isFile()) {                  //isfile used to print files only
				System.out.println(out.getName());
			}
		}
		
		
		
		for(File out : f) {
			if(out.isDirectory()) {                  //isDrectory used to print folder only
				System.out.println(out.getName());
			}
		}
		
		for(File out : f) {
			String fname=out.getName();
			if(fname.endsWith(".png")) {                  //to print specfic folder only
				System.out.println(out.getName());
			}
		}
	}
}
