package diwaliForce;
import java.util.*;
public class presentElement10 {
	static Scanner in=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter 1St array");
		int[] firstArr=getArr();
		System.out.println("Enter 2nd array");
		int[] secondArr=getArr();
		for(int i=0;i<firstArr.length;i++) {
			boolean b=true;
			for(int j=0;j<secondArr.length;j++) {
				if(firstArr[i]==secondArr[j]) {
					b=false;
					break;
				}
			}
		if(b)
			System.out.print(firstArr[i]+" ");
		}
		
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
}
