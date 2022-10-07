package methodTask;
import java.util.*;
public class countVowel {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String word=in.nextLine();
		int n=word.length();
		countVowel obj=new countVowel();
		obj.coUnt(word,n);
	in.close();}
	void coUnt(String s,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='i'||s.charAt(i)=='I'||
									s.charAt(i)=='o'||s.charAt(i)=='O'
					|| s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='U'||s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("No of vowels in a String "+count);
	}
}
/*Write a Java method to count all vowels in a string.
 Input the string: Education
 Expected Output: Number of Vowels in the string: 5
 */