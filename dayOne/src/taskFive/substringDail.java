package taskFive;
import java.util.*;
public class substringDail {
	
	
	
	static void possibleString(String n){
		String res =elementString(n);
		
	}
	
	
	
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		String element=in.next();
		possibleString(element);
		in.close();}
	
	
	
	static String elementString(String n) {
		String res="";
		for(int i=0;i<n.length();i++) {
			switch(Character.getNumericValue(n.charAt(i))) {
			case 1:
				res+="";
				break;
			case 2:
				res+="abc";
				break;
			case 3:
				res+="def";
				break;
			case 4:
				res+="ghi";
				break;
			case 5:
				res+="jkl";
				break;
			case 6:
				res+="mno";
				break;
			case 7:
				res+="pqrs";
				break;
			case 8:
				res+="tuv";
				break;
			case 9:
				res+="wxyz";
				break;
			}
		}
		return res;
	}
	
	
	
}
