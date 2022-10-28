package diwaliForce;
import java.util.*;
public class longSubArray5 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of element");
		int m=in.nextInt();
		int sum,count,max=Integer.MIN_VALUE;
		System.out.println("Enter the elements");
		int num[]=new int[m];
		for(int i=0;i<m;i++) {
			num[i]=in.nextInt();
		}
		System.out.println("Enter the target element");
		int tar=in.nextInt();
		for(int i=0;i<m;i++) {
			sum=num[i];
			for(int j=i+1;j<m;j++) {
				count=1;
				sum+=num[j];
				count++;
				
				if(tar<sum) {
					break;
				}
				else if(tar>sum) {
					continue;
				}
				else {
					if(max<count)
						max=count;
					
				}
			}
		}
		System.out.println(max);
	}
}
