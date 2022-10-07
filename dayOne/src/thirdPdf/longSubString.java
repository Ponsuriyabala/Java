package thirdPdf;
import java.util.*;
public class longSubString {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int n=str.length();
		int arrSize=n*(n+1)/2;
		System.out.print(Arrays.toString(SubString(str,arrSize)));
		in.close();}
	static String[] SubString(String str,int n) {
		String[] words=new String[n];
		int k=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {				
				words[k++]=str.substring(i,j);
			}
		}return words;
	}
//	static String[] sUbArr(String str) {
//		String res="";
//		int j=0;
//		for(int i=0;i<str.length();i++) {
//				if(str.charAt(i)==' ') {
//					String[j++] words=res;
//				}
//				else {
//					res+=str.charAt(i);
//				}
//		}
//		return words;
//	}
}
/* Given a string s and an integer k, return the length of the longest substring ofssuch that the
frequency of each character in this substring is greater than or equal tok.
Input: s = "aaabb", k = 3
Output: 3
Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
Input: s = "ababbc", k = 2
Output: 5
Explanation: The longest substring is "ababb", as 'a' is repeated 2
times and 'b' is repeated 3 times*/