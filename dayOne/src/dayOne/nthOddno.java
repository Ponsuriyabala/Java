package dayOne;
import java.util.*;
public class nthOddno {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int sum=0;
		int n=in.nextInt();
		for(int i=1;i<=n*2;i++) {
			if(i%2!=0)
				System.out.println(i);
			sum+=i;
		}
		System.out.println(sum);
		in.close();
	}
}
/*Write a program in Java to display the n terms of odd natural number
and their sum.
Input number of terms is: 5
Expected Output :
The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number up to 5 terms is: 25*/