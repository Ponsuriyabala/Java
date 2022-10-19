package secondPdf;
import java.util.*;
public class palindrome {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the sentence ");
		String str=in.nextLine();
		String sortSen=upperTolower(str);
		String rev="";
		for(int i=sortSen.length()-1;i>=0;i--) {
			rev=rev+sortSen.charAt(i);
		}
		System.out.print("Giving sentence is ");
		if(sortSen.equals(rev)) 
			System.out.println("Palindrome");
		else
			System.out.print("Not Palindrome");
		in.close();}
	static String upperTolower(String s) {
		char[] iparr=new char[s.length()];
		String oparr="";
		for(int i=0;i<s.length();i++) {
			iparr[i]=s.charAt(i);
			if(iparr[i]>='A'&& iparr[i]<='Z') {
				int r=(int)iparr[i]+32;
				oparr+=(char)r;
			}else if(iparr[i]>='a'&& iparr[i]<='z') {
				oparr+=iparr[i];
			}
			else {
				continue;
			}
		}
		return oparr;
	}

}
/*Given a String with or without special characters find if it is Palindrome or Not.. No splitting of
array must be done or No additional spaces must be used for storing the array..
Eg: RACE CAR
Eg: I DID, DID I ?*/