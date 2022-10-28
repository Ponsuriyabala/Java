package diwaliForce;
import java.util.*;
public class stringEqual16 {
	public static void main(String[] args) {
		System.out.println("Enter 1St array");
		String[] firstArr=getArr();
		System.out.println("Enter 2nd array");
		String[] secondArr=getArr();
		String wordFirst=wholeWord(firstArr);
		String wordSecond=wholeWord(secondArr);
		if(wordFirst.equals(wordSecond)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	static String[] getArr() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of element in array");
		int m=in.nextInt();
		System.out.println("Enter array elements");
		String num[]=new String[m];
		for(int i=0;i<m;i++) {
			num[i]=in.next();
		}
		return num;
	}
	static String wholeWord(String[] arr) {
		String res="";
		for(int i=0;i<arr.length;i++) {
			res=res+arr[i];
		}
		return res;
	}
}
