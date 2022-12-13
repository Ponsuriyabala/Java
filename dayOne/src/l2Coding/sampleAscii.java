package l2Coding;
import java.util.Scanner;
public class sampleAscii {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String res="";
		if(n<27) {
			n=n+64;
			res=res+(char)n;
		}
		else if(n%26==0) {
			n=n/26;
			n=n+64;
			res=res+(char)n;
			}
		else if(n>26) {
		int m=n/26;
		m=m+64;
		n=n%26;
		n=n+64;
		res=res+(char)m;
		res=res+(char)n;
		}
		System.out.println(res);
	}
}
