package secondPdf;
import java.util.*;
public class posIntCount {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter No of elements");
		int n=in.nextInt();
		System.out.println("Enter array elements");
		int []num=new int[n];
		for(int i=0;i<n;i++) {
			int r=in.nextInt();
			if(r>=0) { 
				num[i]=r;
			}
			else {
				System.out.println("Enter only positive numbers");
				i--;
			}
		}
		for(int i=0;i<n;i++) {
			if(num[i]<0) {
				continue;
			}
			else {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(num[i]==num[j]) {
					count+=1;
					num[j]=-1;
				}
			}System.out.println(num[i]+" | "+count);
			}
		}
		in.close();}
}
/*Given an array of positive integers. The output should be the number of occurrences of each
number.
Example:
Input: {2, 3, 2, 6, 1, 6, 2}
Output:
1 – 1
2 – 3
3 – 1
6 – 2*/