package l2Coding;
import java.util.*;
public class longestNum {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of element");
		int n=in.nextInt();
		int temp;
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
			System.out.println("Multiple"+num[n-1]*num[n-2]*num[n-3]);		
	}
}
