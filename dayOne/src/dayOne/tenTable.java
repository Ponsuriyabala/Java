package dayOne;
import java.util.*;
public class tenTable {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+" * "+n+" = "+n*i);
		}
		in.close();
	}
}


/*. Write a Java program that takes a number as input and prints its
multiplication table up to 10.*/