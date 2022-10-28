package diwaliForce;
import java.util.*;
public class unionSort4 {
	static Scanner in=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter 1St array");
		int[] firstArr=getArr();
		System.out.println("Enter 2nd array");
		int[] secondArr=getArr();
		findUnion(firstArr,secondArr);
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
	static void findUnion(int num1[],int num2[]) {
		int[] temp=new int[num1.length+num2.length];
		int j=0;
		for(int i=0;i<num1.length;i++) {
			temp[j++]=num1[i];
		}
		for(int i=0;i<num2.length;i++) {
			temp[j++]=num2[i];
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=-99) {
				System.out.print(temp[i]+" ");
				for(int k=i+1;k<temp.length;k++) {
					if(temp[k]==temp[i]) {
						temp[k]=-99;
					}
				}
			}
		}
	}
}
