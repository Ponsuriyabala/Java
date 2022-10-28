package diwaliForce;
import java.util.*;
public class pattErn22 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n%2!=0||n==0) {
			n=in.nextInt();
		}
		int r=n;
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				if(i!=0) {
					
					if(i<=j&&j<n-i) {
						System.out.print(r);
					}
					else {
						System.out.print(n);
					}
				}
				else {
					System.out.print(n);
				}
			}
			r--;
			System.out.println();
		}
		r=r+1;
		for(int i=n/2-1;i>=0;i--) {
			for(int j=0;j<n;j++) {
				if(i!=0) {
					if(i<=j&&j<n-i) {
						System.out.print(r);
					}
					else {
						System.out.print(n);
					}
				}
				else {
					System.out.print(n);
				}
			}
			r++;
			System.out.println();
		}
	}
}