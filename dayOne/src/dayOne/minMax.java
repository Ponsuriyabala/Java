package dayOne;
import java.util.*;
public class minMax {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i] =in.nextInt();
	}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(num[i]>num[j]) {
				num[i]=num[i]+num[j];
				num[j]=num[i]-num[j];
				num[i]=num[i]-num[j];
			}
		}
		}
		int min=num[0];
		int max=num[n-1];
		System.out.println("Minimum= "+min+" Maximum= "+max);
		in.close();
}
}


/*Given an array A of size N of integers. Your task is to find the minimum
and maximum elements in the array.
Example 1:
Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max = 10000
Example 2:
Input:
N = 5
A[] = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 5678*/