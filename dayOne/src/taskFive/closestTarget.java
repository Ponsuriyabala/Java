package taskFive;
import java.util.*;
public class closestTarget {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number element");
		int n=in.nextInt();
		int sum=0,r,result = 0;
		int min=1000;
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
		}
		System.out.println("Enter the target no");
		int tar=in.nextInt();
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					sum=num[i]+num[j]+num[k];
					r=Math.abs(sum-tar);
					if(r<min) {
						min=r;
					    result = sum;
					}
				}
			}
		}
		System.out.println(result);
		in.close();}
}