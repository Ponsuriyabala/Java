package secondPdf;
import java.util.*;
public class middlePattern {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the word :");
		String str=in.nextLine();
		System.out.print("Enter no of rows");
		int n=in.nextInt();
		String neWstr=miDDle(str);
		System.out.println(neWstr);
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(neWstr.charAt(j)+" ");
			}
			
			System.out.println();
		}
	in.close();}
	static String miDDle(String s) {
		char[] ch=s.toCharArray();
		String res="";
		int sep=(s.length()-1)/2;
		for(int i=sep;i<s.length();i++) {
			res+=ch[i];
		}
		for(int i=0;i<sep;i++) {
			res+=ch[i];
		}
		
		return res;
	}
}
/*Input: PROGRAM
Output:
G
GR
GRA
GRAM
GRAMP
GRAMPR
GRAMPRO*/