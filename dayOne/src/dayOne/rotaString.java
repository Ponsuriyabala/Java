package dayOne;
import java.util.*;
public class rotaString {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		String b=in.nextLine();
		int n = a.length();
		int j=0;
		for(int i=2;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(j)) {
				j++;
			}
		}
		for(int i=0;i<2;i++) {
			if(a.charAt(i)==b.charAt(j)) {
				j++;
			}
		}
		if(n==j) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	in.close();
	}
}




/*) Given two strings a and b. The task is to find if the string 'b' can be obtained
by rotating another string 'a' by exactly 2 places.
Example 1:
Input:
a = amazon
b = azonam
Output: 1
Example 2:  Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 0*/