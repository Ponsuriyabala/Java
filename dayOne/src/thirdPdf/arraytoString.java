package thirdPdf;
import java.util.*;
public class arraytoString {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no of digits :");
		int n=in.nextInt();
		System.out.println("Enter the element");
		String[] num=new String[n];
		for(int i=0;i<n;i++) {
			num[i]=in.next();
		}
		arraytoString obj=new arraytoString();
		System.out.println(obj.arrange(num, n));
	in.close();}
		String arrange(String arr[],int n){
			String temp;
			String s="";
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					String ij=arr[i]+arr[j];
					String ji=arr[j]+arr[i];
					if(Long.parseLong(ij)<Long.parseLong(ji)) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}s+=arr[i];
			}
		return s;
		}
}
/* Given a list of non-negative integers nums, arrange them such that they form the largest number
and return it. Since the result may be very large, so you need to return a string instead of an
integer.
Input: nums = [10,2]
Output: "210"
Input: nums = [3,30,34,5,9]
Output: "9534330"
*/