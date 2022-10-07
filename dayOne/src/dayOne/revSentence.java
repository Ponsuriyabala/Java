package dayOne;
import java.util.*;
public class revSentence {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String Sen= in.nextLine();
		char[] Arr=Sen.toCharArray();
		int n=Arr.length;
		int count =0;
		for(int i=n-1;i>=0;i--) {
			if(Arr[i]!='.') {
				count++;
			}
			else {
				for(int j=i+1;j<count+i+1;j++) {
					System.out.print(Arr[j]);
				}
				System.out.print(".");
				count=0;
			}
		}
		for(int i=0;i<n;i++) {
			if(Arr[i]!='.') {
				System.out.print(Arr[i]);
			}
			else {
				break;
			}
		}
		in.close();}
}



/*1) Given a String S, reverse the string without reversing its individual words.
Words are separated by dots.
Example 1:
Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Example 2:
Input:
S = pqr.mno
Output: mno.pqr*/