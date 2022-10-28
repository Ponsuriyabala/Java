package diwaliForce;
import java.util.*;
public class distinitIndex6 {
	static Scanner in=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter 1St array");
		int[] firstArr=getArr();
		System.out.println("Enter 2nd array");
		int[] secondArr=getArr();
		findExtra(firstArr,secondArr);
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
	static void findExtra(int num1[],int num2[]) {
		for(int i=0;i<num1.length;i++) {
			for(int k=0;k<num2.length;k++) {
				if(num2[k]==num1[i]) {
					num1[i]=-99;
					num2[k]=-99;
				}
			}
		}
		for(int i=0;i<num1.length;i++) {
			if(num1[i]!=-99) {
				System.out.print("ExtraElement is "+num1[i]+" Index of 1st array"+i);
			}
		}
	}
}
