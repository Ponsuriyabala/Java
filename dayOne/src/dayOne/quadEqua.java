package dayOne;
import java.util.*;
public class quadEqua {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		double a = in.nextDouble();   
		double b = in.nextDouble();  
		double c = in.nextDouble();  
		double d= Math.sqrt(b * b - 4.0 * a * c);  
		if(d>0) {
			System.out.println(-b+d/2*a);
			System.out.println(-b-d/2*a);
		}
		else if(d==0) {
			System.out.println(-b/2*a);
		}
		else {
			System.out.println("No roots");
		}
	}
}




/*Write a Java program to solve quadratic equations (use if, else if and
else)*/