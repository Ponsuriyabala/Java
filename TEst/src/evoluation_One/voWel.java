package evoluation_One;
import java.util.*;
public class voWel {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		System.out.println(removeVow(str));
		in.close();}
	static String removeVow(String a) {
		String res="";
		char[] ch=new char[a.length()];
		for(int i=0;i<a.length();i++) {
			ch[i]=a.charAt(i);
		}
		for(int i=0;i<a.length();i++) {
			if(ch[i]=='@') {
				continue;
			}
			else if(ch[i]=='a'|| ch[i]=='A'
					|| ch[i]=='e'|| ch[i]=='E'
					||ch[i]=='i'|| ch[i]=='I'
					||ch[i]=='o' || ch[i]=='O' 
					||ch[i]=='u'|| ch[i]=='U') {
				for(int j=i+1;j<a.length();j++) {
					if(ch[i]==ch[j]) {
						res+=String.valueOf(ch[i]);
						for(int k=j+1;k<a.length();k++) {
							if(ch[i]==ch[k]) {
								res+=String.valueOf(ch[k]);
								ch[k]='@';
							}
						
						}
					}
				}
			}
			else {
				res+=a.charAt(i);
			}
		}
		return res;
	}
}

//res+=a.charAt(i);
//res+=a.charAt(j);
//i=i+1;