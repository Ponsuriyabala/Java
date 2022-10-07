package thirdPdf;

import java.util.Arrays;

public class sortString {
	public static void main(String args[]) {
		String str=args[0];
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		String res="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=(char)64){
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]){
						ch[j]=(char)64;
					} 
				}		
				res+=ch[i];
			}
		} 
		char[] resulT=new char[res.length()];
		for(int i=0;i<res.length();i++) {
			resulT[i]=res.charAt(i);
		}
		for(int i=0;i<resulT.length;i++) {
			char temp=' ';
			for(int j=i+1;j<resulT.length;j++) {
				if(resulT[i]>resulT[j]){
					 temp=resulT[i];
					 resulT[i]=resulT[j];
					 resulT[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(resulT));
	}
} 