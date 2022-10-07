package dayOne;
import java.util.*;
public class powerMul {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int res=1;
		int a=in.nextInt();
		int b=in.nextInt();
		for(int i=0;i<b;i++) {
			res*=a;
		}
		System.out.println(res);
		in.close();
	}	
}
/*.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java builtin method).*/