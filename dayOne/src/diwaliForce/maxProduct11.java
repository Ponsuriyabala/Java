package diwaliForce;
import java.util.*;
public class maxProduct11 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of element");
		int m=in.nextInt();
		int max=Integer.MIN_VALUE;
		System.out.println("Enter the elements");
		int num[]=new int[m];
		for(int i=0;i<m;i++) {
			num[i]=in.nextInt();
		}
		for(int i=0;i<m-2;i++) {
			for(int j=i+1;j<m-1;j++) {
				for(int k=j+1;k<m;k++) {
					int res=num[i]*num[j]*num[k];
					if(res>max)
						max=res;
				}
			}
		}
		System.out.println("Maxi product : "+max);
	}
}
