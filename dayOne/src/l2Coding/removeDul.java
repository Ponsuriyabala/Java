package l2Coding;
import java.util.*;
public class removeDul {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of element");
		int n=in.nextInt();
		int count=0;
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			if(num[i]!=99) {
				
				count++;
				for(int j=i+1;j<n;j++) {
					if(num[i]==num[j]) {
						num[j]=99;
					}
				}
			}
		}
	  for(int i=0;i<n;i++) {
		  if(num[i]!=99) {
			  System.out.print(num[i]+",");
		  }
	  } 
	  for(int i=0;i<n;i++) {
		  if(num[i]==99) {
			  System.out.print("_,");

		  }
	  }
	}
}
