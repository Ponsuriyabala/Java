package l2Coding;

import java.util.*;
public class dualSort {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp;
		int[] num=new int[n];
		int[] temparr=new int[n];
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
		int j=0;
		for(int i=0;i<n;i=i+2) {
			temparr[i]=num[j++];
		}
		for(int i=n-1;i>=0;i=i-2) {
			temparr[i]=num[j++];
		}
		for(int i=0;i<n;i++) {
			System.out.print(temparr[i]);
			if(i<n-1) {
				System.out.print(",");
			}
		}
	}
}
