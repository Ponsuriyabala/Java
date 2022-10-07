package thirdPdf;
import java.util.*;
public class subFreq {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int n=str.length();
		char[] ch=new char[n];
		for(int i=0;i<n;i++) {
			ch[i]=str.charAt(i);
		}
		String res="";
		for(int i=0;i<n;i++) {
			if(ch[i]!=(char)64) {
				for(int j=i+1;j<n;j++) {
					if(ch[i]==ch[j]) {
						ch[j]=(char)64;
					}
				}
				res+=ch[i];
			}
		}System.out.println(res);
		System.out.println(Arrays.toString(ch));
		int[] aplCou=new int[res.length()];
		int k=0;
		int count = 0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==(char)64) {
				 count=1;
				
				
			}aplCou[k++]=count;
		}
		System.out.print(Arrays.toString(aplCou));
		in.close();}
}
//		System.out.println("Enter the word");
//		String str=in.nextLine();
//		char[] ch=new char[str.length()];
//		for(int i=0;i<str.length();i++) {
//			ch[i]=str.charAt(i);
//		}
////		String duplicate=dupli(ch);
////		System.out.println(duplicate);
//		int[] k=new int[256];
//		char cv='0';
//		int count=0,s=0;
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]!=cv) {
//				for(int j=i+1;j<ch.length;j++) {
//					if(ch[i]==ch[j]) {
//						count++;
//						ch[j]=cv;
//					}
//				}
//			}
//			k[s++] = count;
//			System.out.println(ch[i]+" "+count);
//		}
//		in.close();}
//	static String dupli(char[] ch){
//		char cv=(int)65;
//		String s="";
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]!=cv) {
//				for(int j=i+1;j<ch.length;j++) {
//					if(ch[i]==ch[j]) {
//						ch[j]=cv;
//						s+=ch[i];
//					}
//				}
//			}
//		}
//		return s;
//	}
//}
/* Given a string s and an integer k, return the length of the longest substring ofssuch that the
frequency of each character in this substring is greater than or equal tok.
Input: s = "aaabb", k = 3
Output: 3
Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
Input: s = "ababbc", k = 2
Output: 5
Explanation: The longest substring is "ababb", as 'a' is repeated 2
times and 'b' is repeated 3 times.*/