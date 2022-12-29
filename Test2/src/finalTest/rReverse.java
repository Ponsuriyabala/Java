package finalTest;


import java.util.Scanner;

public class rReverse {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sen=in.nextLine();
		int wordCount=1;
		for(int i=0;i<sen.length();i++) {
			if(sen.charAt(i)==' ') {
				wordCount++;
			}
		}
		int ind=0;
		String temp="";
		String[] words=new String[wordCount];
		
		for(int i=0;i<sen.length();i++) {
				if(sen.charAt(i)==' ') {
				words[ind]=temp;
				ind++;
				i++;
				temp="";
				}
				temp+=sen.charAt(i);
				if(i<sen.length())
					words[ind]=temp;
		}
		System.out.println("1.odd/n2.even");
		int choice=in.nextInt();
		if(choice==1) {
			for(int i=1;i<=words.length;i++) {
				if(i%2!=0) {
					String rev=words[i-1];
					String revtemp="";
					for(int j=rev.length()-1;j>=0;j--) {
						revtemp+=rev.charAt(j);
					}
					words[i-1]=revtemp;
				}
			}
		}
		else {
			for(int i=1;i<=words.length;i++) {
				if(i%2==0) {
					String rev=words[i-1];
					String revtemp="";
					for(int j=rev.length()-1;j>=0;j--) {
						revtemp+=rev.charAt(j);
					}
					words[i-1]=revtemp;
				}
			}
		}
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
		}
	}
}
