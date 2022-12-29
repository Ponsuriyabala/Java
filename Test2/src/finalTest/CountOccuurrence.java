package finalTest;
import java.util.Scanner;
public class CountOccuurrence {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String word=in.next();
		char ch[]=new char[word.length()];
		for(int i=0;i<word.length();i++) {
			ch[i]=word.charAt(i);
		}
		int count;
		String res="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='@') {
				count =1;
				if(i<ch.length) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						ch[j]='@';
						count++;
					}
				}
				}
				
				
				res+=ch[i]+Integer.toString(count);
			}
		}
		System.out.println("Final"+res);
	}
}
