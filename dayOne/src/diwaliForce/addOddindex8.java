package diwaliForce;
import java.util.*;
public class addOddindex8 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		
		int m=in.nextInt();
		int num[]=new int[m];
		for(int i=0;i<m;i++) {
			num[i]=in.nextInt();
		}
		int k=num[0];
		for(int i=3;i<m;i=i+2) {
			k+=num[i];
		}
		System.out.println(k);
	}
}
