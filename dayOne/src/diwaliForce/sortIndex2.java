package diwaliForce;
import java.util.*;
public class sortIndex2 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of element");
		int m=in.nextInt();
		System.out.println("Enter the elements");
		int num[]=new int[m];
		for(int i=0;i<m;i++) {
			num[i]=in.nextInt();
		}
		for(int i=0;i<m-1;i=i+2) {
			num[i]=num[i]+num[i+1];
			num[i+1]=num[i]-num[i+1];
			num[i]=num[i]-num[i+1];
		}
		for(int i=0;i<m;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
