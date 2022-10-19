package l2Coding;
import java.util.*;
public class sumPair {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of element");
		int n=in.nextInt();
		int temp=0,count=0;
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
		int[] res=new int[count+1];
		int j=0;
		for(int i=0;i<n;i++) {
			  if(num[i]!=99) {
				  res[j++]=num[i];
			  }
		  } 
		System.out.println("Enter target number");
		int tar=in.nextInt();
		int negtar=-(tar);
		for(int i=0;i<count+1;i++) {
			for(int k=i+1;k<count+1;k++) {
				temp=res[i]+res[k];
				if(temp==tar){
					System.out.println("("+res[i]+","+res[k]+")");
				}
			
			}
		}
		in.close();}
}
