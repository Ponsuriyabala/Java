package dayOne;
import java.util.*;
public class aplhaCheck{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String sen=in.nextLine();
		int[] count=new int[26];
		for(int i=0;i<26;i++) {
			count[i]=0; 
		}	
		int coun;
		for(int i=0;i<sen.length();i++) {
			if(sen.charAt(i)>='a'&& sen.charAt(i)<='z') {
				coun=sen.charAt(i)-97;
			}
			else if(sen.charAt(i)>='A'&& sen.charAt(i)<='Z') {
				coun=sen.charAt(i)-65;
			}
			else {
				continue;
			}
			count[coun]=1;
		}
		boolean flag=true ;
		for(int i=0;i<26;i++) {
		   if(count[i]==0) {
			   flag=false;
			   break;
		   }
		}
		if(flag==true) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	in.close();
	}
}

/*2) Given a string check if it is Pangram or not. A pangram is a sentence
containing every letter in the English Alphabet.
Example 1:
Input:
S = Bawds jog, flick quartz, vex nymph
Output: 1
Example 2:
Input:
S = sdfs
Output: 0
*/