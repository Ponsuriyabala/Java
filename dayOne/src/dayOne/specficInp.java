package dayOne;
import java.util.*;
public class specficInp {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
			if(num[i]>=0 &&num[i]<=2) { 
				continue;
			}
			else {
				System.out.println("Make Correct input");
				i--;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(num[i]>num[j]) {
					num[i]=num[i]+num[j];
					num[j]=num[i]-num[j];
					num[i]=num[i]-num[j];
				}
			}
			System.out.println(num[i]);
		}
		in.close();
	}
}


/* Given an array of size N containing only 0s, 1s, and 2s; sort the array in
ascending order.
Example 1:
Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Example 2:
Input:
N = 3
arr[] = {0 1 0}
Output:
0 0 1*/