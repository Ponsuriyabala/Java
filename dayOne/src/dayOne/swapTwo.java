package dayOne;
import java.util.*;
public class swapTwo {
	void Swap(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		swapTwo out=new swapTwo();
		out.Swap(a,b);
		in.close();
	}
}



/* Write a Java program to swap two variables.*/