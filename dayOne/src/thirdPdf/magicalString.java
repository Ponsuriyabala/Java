package thirdPdf;
import java.util.*;
public class magicalString {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of element :");
		int n=in.nextInt();
		int[] resuLt=new int[n];
		for(int i=0;i<3;i++) {
			resuLt[i]=in.nextInt();
		}
		int j=2;
		int m=3;
		for(int i=2;i<n-1;i++) {
			if(resuLt[j]==2) {
				if(resuLt[i]==2) {
					for(int k=1;k<=resuLt[j];k++) {
						resuLt[m++]=1;
						j++;
					}
				}
				else {
					resuLt[m++]=1;
					j++;
				}
			}
		else{
			if(resuLt[i]==2) {
				for(int k=1;k<=resuLt[j];k++) {
					resuLt[m++]=2;
					j++;
				}
			}
			else {
				resuLt[m++]=2;
				j++;
			}
		}
	}
	for(int a:resuLt) {
		System.out.print(a+" ");
	}
	in.close();}
}
/*The first few elements of s is s = "1221121221221121122……". If we group the consecutive 1's
		and 2's in s, it will be "1 22 11 2 1 22 1 22 11 2 11 22 ......" and the occurrences of
		1's or 2's in each group are "1 2 2 1 1 2 1 2 2 1 2 2 ......". You can see that the
		occurrence sequence is s itself.
		Given an integer n, return the number of 1's in the first n number in the magical string s
 */