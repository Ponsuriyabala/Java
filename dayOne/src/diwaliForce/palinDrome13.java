package diwaliForce;
import java.util.*;
public class palinDrome13 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		boolean b=true;
		System.out.println("Enter the word");
		String str=in.next();
		String res=str;
		int str_len=str.length();
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println("It's palindrome");
		}
		else {
			for(int i=1;i<str_len;i++) {
				res=str.charAt(i)+res;
			}
		}
		System.out.println(res);
	}
}
