package methodTask;
import java.util.*;
public class countWord {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String sent=in.nextLine();
		int n=sent.length();
		count(sent,n);
	in.close();}
	static void count(String s,int n) {
		int count=1;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("No of words in Sentence : "+count);
	}

}
/* Write a Java method to count all words in a string.
 Input the string: The quick brown fox jumps over the lazy dog.
 Expected Output: Number of words in the string: 9
 */