package diwaliForce;
import java.util.*;
public class sortMedian9 {
	static Scanner in=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter 1St array");
		int[] firstArr=getArr();
		System.out.println("Enter 2nd array");
		int[] secondArr=getArr();
		System.out.println(findMedian(firstArr,secondArr));
	}
	static int[] getArr() {
		System.out.println("Enter no of element in array");
		int m=in.nextInt();
		System.out.println("Enter array elements");
		int num[]=new int[m];
		for(int i=0;i<m;i++) {
			num[i]=in.nextInt();
		}
		return num;
	}
	static double findMedian(int num1[],int num2[]) {
		int[] temp=new int[num1.length+num2.length];
		int k=0;
		double ans;
		for(int i=0;i<num1.length;i++) {
			temp[k++]=num1[i];
		}
		for(int i=0;i<num2.length;i++) {
			temp[k++]=num2[i];
		}
		for(int i=0;i<temp.length-1;i++) {
			for(int j=i+1;j<temp.length;j++) {
				if(temp[i]>temp[j]) {
					temp[i]=temp[i]+temp[j];
					temp[j]=temp[i]-temp[j];
					temp[i]=temp[i]-temp[j];
				}
			}
		}
		int m=temp.length/2;
		if(temp.length%2==0) {
			ans=(temp[m-1]+temp[m])/2.0;
			return ans;
		}
		else {
			ans=temp[m];
			return ans;
		}
	}
}
