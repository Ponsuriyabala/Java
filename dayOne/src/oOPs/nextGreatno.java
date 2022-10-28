package oOPs;
import java.util.*;
public class nextGreatno {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of element");
		int n=in.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
		}
		in.close();
	}
}