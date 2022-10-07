package secondPdf;
import java.util.*;
public class sameIntadd {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of element");
		int n=in.nextInt();
		System.out.print("");
		int []num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
		}
		System.out.print(reSult(num,n));
		in.close();}
	static String reSult(int arr[],int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[n-1]) {
				arr[count++]=arr[i];
			}
				else if(arr[i]!=0) {
					if(arr[i]==arr[i+1]) {
						int r=arr[i]+arr[i+1];
						arr[count++]=r;
						arr[i+1]=0;
				}
					else {
						arr[count++]=arr[i];
					}
			}
		}
		for(int i=count;i<n;i++) {
			arr[i]=0;
		}
		String r=Arrays.toString(arr);
		return r;
	}
}
/* Given an array of integers of size n. Convert the array in such a way that if next valid number is
same as current number, double its value and replace the next number with 0. After the
modification, rearrange the array such that all 0’s are shifted to the end.
Input : arr[] = {2, 2, 0, 4, 0, 8}      Output : 4 4 8 0 0 0
Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}        Output : 4 2 12 8 0 0 0 0 0 0
 */