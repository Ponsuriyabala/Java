package taskFive;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class reGex {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		boolean b=false;
		System.out.println("Enter the Pattern");
		String firSt=in.next();
		System.out.println("Enter the String");
		String secOnd=in.next();
		/*Pattern p=Pattern.compile(firSt);
		Matcher m=p.matcher(secOnd);
	    b=m.matches();*/
		/*b=Pattern.compile(firSt).matcher(secOnd).matches();*/ 
		b=Pattern.matches(firSt,secOnd); 
		if(b)
			System.out.println("true");
		else
			System.out.println("false");
	in.close();}
}
