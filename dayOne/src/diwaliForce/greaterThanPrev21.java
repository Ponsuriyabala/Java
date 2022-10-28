package diwaliForce;
import java.util.*;
public class greaterThanPrev21 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		boolean max=false;
		int num[]=new int[m];
		for(int i=0;i<m;i++) {
			num[i]=in.nextInt();
		}
		for(int i=0;i<m;i++) {
			for(int j=i;j>=0;j--) {
				if(num[i]<num[j]) {
				max=false;	
				}
				else {
					max=true;
				}
			}
			if(max)
				System.out.print(num[i]+" ");
		}	
	}
}
