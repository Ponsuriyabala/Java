package diwaliForce;
import java.util.*;
public class monoDigit19 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		String num=in.next();
		boolean b=true;
		String res=String.valueOf(num.charAt(0));
		for(int i=1;i<num.length()-1;i=i+2) {
			int r=Character.getNumericValue(num.charAt(i))+Character.getNumericValue(num.charAt(i+1));
			int n=Character.getNumericValue(num.charAt(i))-Character.getNumericValue(num.charAt(i+1));
			if(r==Character.getNumericValue(num.charAt(0))) {
				res+=String.valueOf(r);
			}
			else if(Math.abs(n)==Character.getNumericValue(num.charAt(0))){
				res+=String.valueOf(Math.abs(n));
			}
			else {
				System.out.println("Couldn't form mono-digits");
				b=false;
				break;
			}
		}
		if(b)
		System.out.println(res);
	}
}
