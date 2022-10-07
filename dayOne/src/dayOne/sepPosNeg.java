package dayOne;
import java.util.*;
public class sepPosNeg {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int j=0;
		int n=in.nextInt();
		int[] arr=new int[n];
		int[] num=new int[n];
		for(int i=0;i<n;i++){
				num[i]=in.nextInt();
		}
		for(int i=0;i<num.length;i++){
			if(num[i]>=0)
				arr[j++]=num[i];
		}
		for(int i=0;i<num.length;i++) {
				if(num[i]<0) {
					arr[j++]=num[i];
				}
		}
		System.out.print(Arrays.toString(arr));
		in.close();}
}





/*Given an unsorted array arr[] of size N having both negative and positive
integers. The task is place all negative element at the end of array without
changing the order of positive element and negative element.
Example 1:
Input :
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output :
1  3  2  11  6  -1  -7  -5
Example 2:
Input :
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1
*/