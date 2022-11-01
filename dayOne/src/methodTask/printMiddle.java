package methodTask;
import java.util.*;
public class printMiddle {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the String ");
		String str=in.next();
		printMiddle obj=new printMiddle();
		System.out.println(obj.miDDle(str));
	in.close();}
	String miDDle(String s){
		String st="";
		int n=s.length()/2;
		if(s.length()%2==0) {
			st+=s.charAt(n-1);
			st+=s.charAt(n);
		}
		else {
			st+=s.charAt(n);
		}
		return st;
	}
}
/*. Write a Java method to display the middle character of a string.
 Note: a) If the length of the string is odd there will be two middle characters.
 b) If the length of the string is even there will be one middle character.
 Input a string: 350
 Expected Output:The middle character in the string: 5*/