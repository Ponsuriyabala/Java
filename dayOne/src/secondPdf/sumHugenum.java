package secondPdf;
import java.util.*;
public class sumHugenum {
	public static void main(String a[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the First huge number's digits");
		int firstDigi=in.nextInt();
			long[] firstNum=inPut(firstDigi,in);
		System.out.print("Enter the Second huge number's digits");
		int secondDigi=in.nextInt();
			long[] secondNum=inPut(secondDigi,in);
		long intFirst=reSult(firstNum);
			long intSecond=reSult(secondNum);
			long add=intFirst+intSecond;
				String result=String.valueOf(add);
				int[] resultArr=new int[result.length()];
				System.out.println("Sum of huge array");
		for(int i=0;i<result.length();i++) {
			resultArr[i]=result.charAt(i);
			System.out.print(result.charAt(i)+" ");
		}
	}
	static long[] inPut(int n,Scanner in) {
		long []arr=new long[n];
		int r;
		for(int i=0;i<n;i++) {
			r=in.nextInt();
			if(r>=0&&r<=9) {
			arr[i]=r;
			}
			else {
				System.out.println("Enter the elements within 0 to 9");
				i--;
			}
		}
		return arr;
	}
	static long reSult(long arr[]) {
		long res=0;
		for(int i=0;i<arr.length;i++) {
			res=res*10+arr[i];
		}
		return res;
	}
}
/*Given 2 huge numbers as separate digits, store them in array and process them and calculate
the sum of 2 numbers and store the result in an array and print the sum.
Input: Number of digits:12
9 2 8 1 3 5 6 7 3 1 1 6
Number of digits:9
7 8 4 6 2 1 9 9 7
Output :  9 2 8 9 2 0 2 9 5 1 1 3
*/