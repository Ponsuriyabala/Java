package finalTest;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	boolean flag = false;
	System.out.println("Enter the word");
	String word=in.next();
	String iword=word.charAt(0)+"";
	for(int i=1;i<word.length();i++) {
		iword+=word.charAt(i);
		String rev="";
		for(int k=iword.length()-1;k>=0;k--) {
			rev+=iword.charAt(k);
		}
		//System.out.println(rev+" "+iword);
		if(rev.equals(iword)) {
            flag = true;
			iword="";
		}
	}
	if(flag) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	//System.out.println(iword);
}
}
