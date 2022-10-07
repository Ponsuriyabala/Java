package dayOne;
import java.util.*;
public class posNeg {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		float n=in.nextFloat();
		if(n>0) {
			if(n<1)
				System.out.println("Small postive");
			else if(n>100000)
				System.out.println("Large postive");
			else 
				System.out.println("Positive");
		}
		else if(n<0) {
			n *=-1;
			if(n<1)
				System.out.println("Large negative");
			else if(n>100000)
				System.out.println("Small negative");
			else 
				System.out.println("Negative");
		}
		else {
			System.out.println("zero");
		}
		in.close();
	}
}




/*Write a Java program that reads a floating-point number and prints
"zero" if the number is zero. Otherwise, print "positive" or "negative". Add
"small" if the absolute value of the number is less than 1, or "large" if it
exceeds 1,000,000.*/