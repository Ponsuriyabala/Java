package secondPdf;
import java.util.*;
public class swapRuc {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String senTense=in.nextLine();
		int n=senTense.length();
		System.out.print(lastMethod(senTense));
	in.close();}
	
	static String lastMethod(String senWord) {
		int count=0;
		int i=0;
		String str="";
			if(senWord.charAt(i)!=' ') {
				count++;
			}
			else{
				for(int j=i+1;j<count+i+1;j++) {
					str+=senWord.charAt(j);
				}
				str+=senWord.charAt(i);
				count=0;
			}
			lastMethod(str);
//		for(int i=0;i<count;i++) {
//			str+=senWord.charAt(i);
//		}
		return str;
	}
}
