package finalTest;

import java.util.Scanner;

public class DistanceRelationship {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sen=in.nextLine();
		System.out.println("Enter two words from this : "+sen);
		System.out.println("Ente the first String");
		String firsWord=in.next();
		System.out.println("Ente the second String");
		String secWord=in.next();
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
		int diff=-1;
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(firsWord)) {
			for(int j=i+1;j<words.length;j++) {
				if(words[j].equals(secWord)) {
				diff =j-i;
				if(diff!=1)
				diff-=1;
				break;
				}
			}
			}
		}
		System.out.println(diff+" words distance");
//		for(int i=0;i<words.length;i++) {
//			System.out.print(words[i]);
//		}
	}
}
