package dayOne;

import java.util.Arrays;
import java.util.Scanner;

public class SucceedingInt {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		String[] num=new String[n];
		String res="";
		for(int i=0;i<n;i++) {
			num[i] =in.next();
			res+=num[i];
		}
		int dec=Integer.parseInt(res)+1;
		res=String.valueOf(dec);
		n=res.length();
		char[] result=new char[n];
		for(int i=0;i<n;i++) {
			result[i]=res.charAt(i);
		}
		System.out.println(Arrays.toString(result));
	}
}
